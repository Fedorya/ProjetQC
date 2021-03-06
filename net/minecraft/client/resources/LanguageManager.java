package net.minecraft.client.resources;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.data.LanguageMetadataSection;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.util.StringTranslate;

@SideOnly(Side.CLIENT)
public class LanguageManager implements ResourceManagerReloadListener
{
    private final MetadataSerializer field_135047_b;
    private String currentLanguage;
    protected static final Locale currentLocale = new Locale();
    private Map languageMap = Maps.newHashMap();

    public LanguageManager(MetadataSerializer par1MetadataSerializer, String par2Str)
    {
        this.field_135047_b = par1MetadataSerializer;
        this.currentLanguage = par2Str;
        I18n.setLocale(currentLocale);
    }

    public void parseLanguageMetadata(List par1List)
    {
        this.languageMap.clear();
        Iterator iterator = par1List.iterator();

        while (iterator.hasNext())
        {
            ResourcePack resourcepack = (ResourcePack)iterator.next();

            try
            {
                LanguageMetadataSection languagemetadatasection = (LanguageMetadataSection)resourcepack.getPackMetadata(this.field_135047_b, "language");

                if (languagemetadatasection != null)
                {
                    Iterator iterator1 = languagemetadatasection.getLanguages().iterator();

                    while (iterator1.hasNext())
                    {
                        Language language = (Language)iterator1.next();

                        if (!this.languageMap.containsKey(language.getLanguageCode()))
                        {
                            this.languageMap.put(language.getLanguageCode(), language);
                        }
                    }
                }
            }
            catch (RuntimeException runtimeexception)
            {
                Minecraft.getMinecraft().getLogAgent().logWarningException("Unable to parse metadata section of resourcepack: " + resourcepack.getPackName(), runtimeexception);
            }
            catch (IOException ioexception)
            {
                Minecraft.getMinecraft().getLogAgent().logWarningException("Unable to parse metadata section of resourcepack: " + resourcepack.getPackName(), ioexception);
            }
        }
    }

    public void onResourceManagerReload(ResourceManager par1ResourceManager)
    {
        ArrayList arraylist = Lists.newArrayList(new String[] {"en_US"});

        if (!"en_US".equals(this.currentLanguage))
        {
            arraylist.add(this.currentLanguage);
        }

        currentLocale.loadLocaleDataFiles(par1ResourceManager, arraylist);
        LanguageRegistry.instance().loadLanguageTable(currentLocale.field_135032_a, this.currentLanguage);
        StringTranslate.func_135063_a(currentLocale.field_135032_a);
    }

    public boolean isCurrentLocaleUnicode()
    {
        return currentLocale.isUnicode();
    }

    public boolean isCurrentLanguageBidirectional()
    {
        return this.getCurrentLanguage().isBidirectional();
    }

    public void setCurrentLanguage(Language par1Language)
    {
        this.currentLanguage = par1Language.getLanguageCode();
    }

    public Language getCurrentLanguage()
    {
        return this.languageMap.containsKey(this.currentLanguage) ? (Language)this.languageMap.get(this.currentLanguage) : (Language)this.languageMap.get("en_US");
    }

    public SortedSet getLanguages()
    {
        return Sets.newTreeSet(this.languageMap.values());
    }
}
