package io.github.nathanjrussell;

import io.github.natethegreatinc.enums.colors.Logo;
import io.github.natethegreatinc.enums.colors.Website;
import io.github.natethegreatinc.enums.strings.Company;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Welcome to %s!\n", Company.COMPANY_NAME.getString());
        System.out.printf("Our motto is: \"%s\"\n", Company.COMPANY_MOTO.getString());
        System.out.printf("Contact us at %s or visit us at %s\n",
                Company.COMPANY_TELEPHONE.getString(),
                Company.COMPANY_WEBSITE.getString());
        System.out.printf("Our logo font color is %s and background color is %s\n",
                Logo.LOGO_FONT_COLOR.getHexCode(),
                Logo.LOGO_BACKGROUND_COLOR.getHexCode());
        System.out.printf("Our website font color is %s and background color is %s\n",
                Website.WEBSITE_FONT_COLOR.getHexCode(),
                Website.WEBSITE_BACKGROUND_COLOR.getHexCode());
    }
}