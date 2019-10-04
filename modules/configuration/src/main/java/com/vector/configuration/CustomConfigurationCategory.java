package com.vector.configuration;

import com.liferay.configuration.admin.category.ConfigurationCategory;
import org.osgi.service.component.annotations.Component;

@Component(service = ConfigurationCategory.class)
public class CustomConfigurationCategory implements ConfigurationCategory {

    @Override
    public String getCategoryIcon() {
        return null;
    }

    @Override
    public String getCategoryKey() {
        return _CATEGORY_KEY;
    }

    @Override
    public String getCategorySection() {
        return _CATEGORY_SECTION;
    }

    private static final String _CATEGORY_ICON = "";

    private static final String _CATEGORY_KEY = "myownshit";

    private static final String _CATEGORY_SECTION = "platform";
}
