package api.cronapi;

import org.apache.commons.httpclient.protocol.Protocol;
import cronapi.*;
import cronapi.CronapiMetaData.*;

/**
* Controller para expor serviços de CountryInfoServiceStub
*
* @generated
**/
@CronapiMetaData(categoryName = "CountryInfoService")
public class CountryInfoServiceAPI {

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var fullCountryInfo (
    @ParamMetaData(type = ObjectType.OBJECT) Var sCountryISOCodeVar
) throws Exception {

    java.lang.String sCountryISOCode = sCountryISOCodeVar.getTypedObject(java.lang.String.class);

org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.FullCountryInfoResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.FullCountryInfo fullCountryInfo00 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.FullCountryInfo();
                fullCountryInfo00.setSCountryISOCode(sCountryISOCode);

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.fullCountryInfo(fullCountryInfo00);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var countryFlag (
    @ParamMetaData(type = ObjectType.OBJECT) Var sCountryISOCodeVar
) throws Exception {

    java.lang.String sCountryISOCode = sCountryISOCodeVar.getTypedObject(java.lang.String.class);

org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryFlagResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryFlag countryFlag21 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryFlag();
                countryFlag21.setSCountryISOCode(sCountryISOCode);

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.countryFlag(countryFlag21);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var countryName (
    @ParamMetaData(type = ObjectType.OBJECT) Var sCountryISOCodeVar
) throws Exception {

    java.lang.String sCountryISOCode = sCountryISOCodeVar.getTypedObject(java.lang.String.class);

org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryNameResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryName countryName42 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryName();
                countryName42.setSCountryISOCode(sCountryISOCode);

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.countryName(countryName42);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var countryCurrency (
    @ParamMetaData(type = ObjectType.OBJECT) Var sCountryISOCodeVar
) throws Exception {

    java.lang.String sCountryISOCode = sCountryISOCodeVar.getTypedObject(java.lang.String.class);

org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryCurrencyResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryCurrency countryCurrency63 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryCurrency();
                countryCurrency63.setSCountryISOCode(sCountryISOCode);

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.countryCurrency(countryCurrency63);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var listOfCountryNamesByCode (
) throws Exception {


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCountryNamesByCodeResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCountryNamesByCode listOfCountryNamesByCode84 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCountryNamesByCode();

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.listOfCountryNamesByCode(listOfCountryNamesByCode84);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var listOfCurrenciesByName (
) throws Exception {


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCurrenciesByNameResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCurrenciesByName listOfCurrenciesByName105 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCurrenciesByName();

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.listOfCurrenciesByName(listOfCurrenciesByName105);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var countryIntPhoneCode (
    @ParamMetaData(type = ObjectType.OBJECT) Var sCountryISOCodeVar
) throws Exception {

    java.lang.String sCountryISOCode = sCountryISOCodeVar.getTypedObject(java.lang.String.class);

org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryIntPhoneCodeResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryIntPhoneCode countryIntPhoneCode126 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryIntPhoneCode();
                countryIntPhoneCode126.setSCountryISOCode(sCountryISOCode);

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.countryIntPhoneCode(countryIntPhoneCode126);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var currencyName (
    @ParamMetaData(type = ObjectType.OBJECT) Var sCurrencyISOCodeVar
) throws Exception {

    java.lang.String sCurrencyISOCode = sCurrencyISOCodeVar.getTypedObject(java.lang.String.class);

org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CurrencyNameResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CurrencyName currencyName147 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CurrencyName();
                currencyName147.setSCurrencyISOCode(sCurrencyISOCode);

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.currencyName(currencyName147);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var listOfCurrenciesByCode (
) throws Exception {


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCurrenciesByCodeResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCurrenciesByCode listOfCurrenciesByCode168 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCurrenciesByCode();

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.listOfCurrenciesByCode(listOfCurrenciesByCode168);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var listOfLanguagesByCode (
) throws Exception {


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfLanguagesByCodeResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfLanguagesByCode listOfLanguagesByCode189 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfLanguagesByCode();

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.listOfLanguagesByCode(listOfLanguagesByCode189);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var languageISOCode (
    @ParamMetaData(type = ObjectType.OBJECT) Var sLanguageNameVar
) throws Exception {

    java.lang.String sLanguageName = sLanguageNameVar.getTypedObject(java.lang.String.class);

org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.LanguageISOCodeResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.LanguageISOCode languageISOCode2010 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.LanguageISOCode();
                languageISOCode2010.setSLanguageName(sLanguageName);

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.languageISOCode(languageISOCode2010);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var capitalCity (
    @ParamMetaData(type = ObjectType.OBJECT) Var sCountryISOCodeVar
) throws Exception {

    java.lang.String sCountryISOCode = sCountryISOCodeVar.getTypedObject(java.lang.String.class);

org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CapitalCityResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CapitalCity capitalCity2211 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CapitalCity();
                capitalCity2211.setSCountryISOCode(sCountryISOCode);

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.capitalCity(capitalCity2211);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var listOfLanguagesByName (
) throws Exception {


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfLanguagesByNameResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfLanguagesByName listOfLanguagesByName2412 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfLanguagesByName();

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.listOfLanguagesByName(listOfLanguagesByName2412);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var listOfCountryNamesGroupedByContinent (
) throws Exception {


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCountryNamesGroupedByContinentResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCountryNamesGroupedByContinent listOfCountryNamesGroupedByContinent2613 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCountryNamesGroupedByContinent();

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.listOfCountryNamesGroupedByContinent(listOfCountryNamesGroupedByContinent2613);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var listOfCountryNamesByName (
) throws Exception {


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCountryNamesByNameResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCountryNamesByName listOfCountryNamesByName2814 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfCountryNamesByName();

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.listOfCountryNamesByName(listOfCountryNamesByName2814);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var listOfContinentsByName (
) throws Exception {


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfContinentsByNameResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfContinentsByName listOfContinentsByName3015 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfContinentsByName();

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.listOfContinentsByName(listOfContinentsByName3015);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var languageName (
    @ParamMetaData(type = ObjectType.OBJECT) Var sISOCodeVar
) throws Exception {

    java.lang.String sISOCode = sISOCodeVar.getTypedObject(java.lang.String.class);

org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.LanguageNameResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.LanguageName languageName3216 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.LanguageName();
                languageName3216.setSISOCode(sISOCode);

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.languageName(languageName3216);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var listOfContinentsByCode (
) throws Exception {


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfContinentsByCodeResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfContinentsByCode listOfContinentsByCode3417 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.ListOfContinentsByCode();

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.listOfContinentsByCode(listOfContinentsByCode3417);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var countriesUsingCurrency (
    @ParamMetaData(type = ObjectType.OBJECT) Var sISOCurrencyCodeVar
) throws Exception {

    java.lang.String sISOCurrencyCode = sISOCurrencyCodeVar.getTypedObject(java.lang.String.class);

org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountriesUsingCurrencyResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountriesUsingCurrency countriesUsingCurrency3618 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountriesUsingCurrency();
                countriesUsingCurrency3618.setSISOCurrencyCode(sISOCurrencyCode);

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.countriesUsingCurrency(countriesUsingCurrency3618);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var countryISOCode (
    @ParamMetaData(type = ObjectType.OBJECT) Var sCountryNameVar
) throws Exception {

    java.lang.String sCountryName = sCountryNameVar.getTypedObject(java.lang.String.class);

org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryISOCodeResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryISOCode countryISOCode3819 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.CountryISOCode();
                countryISOCode3819.setSCountryName(sCountryName);

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.countryISOCode(countryISOCode3819);

return Var.valueOf(respn);
}

@CronapiMetaData(type = "function", returnType = ObjectType.OBJECT)
public static Var fullCountryInfoAllCountries (
) throws Exception {


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.FullCountryInfoAllCountriesResponse respn = null;


org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub stub = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub();

        org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.FullCountryInfoAllCountries fullCountryInfoAllCountries4020 = new org.oorsprong.www.websamples_countryinfo.CountryInfoServiceStub.FullCountryInfoAllCountries();

org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",  new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), 443));
respn = stub.fullCountryInfoAllCountries(fullCountryInfoAllCountries4020);

return Var.valueOf(respn);
}

}