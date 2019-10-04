package com.vector.configuration;

import aQute.bnd.annotation.metatype.Meta;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

@ExtendedObjectClassDefinition(category = "community-tools")
@Meta.OCD(
        id = "com.vector.configuration.ExampleConfiguration",
        localization = "content/Language",
        name = "example-configuration-name"
)
public interface ExampleConfiguration {

    @Meta.AD(required = false)
    public String fontColor();

    @Meta.AD(required = false)
    public String fontFamily();

    @Meta.AD(required = false)
    public int fontSize();
}
//@ExtendedObjectClassDefinition(category = "breadcrumbs")
//@Meta.OCD(
//        id = "com.liferay.site.navigation.breadcrumb.web.configuration.SiteNavigationBreadcrumbWebTemplateConfiguration",
//        localization = "content/Language",
//        name = "site-navigation-breadcrumb-web-template-configuration-name"
//)
//public interface SiteNavigationBreadcrumbWebTemplateConfiguration {
//
//    @Meta.AD(
//            deflt = "breadcrumb-horizontal-ftl", name = "ddm-template-key-default",
//            required = false
//    )
//    public String ddmTemplateKeyDefault();
//
//}