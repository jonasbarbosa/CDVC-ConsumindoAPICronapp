package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity(filter = "Public", post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class SoapBloco {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// SoapBloco
public static Var BuscaPais() throws Exception {
 return new Callable<Var>() {

   private Var pais = Var.VAR_NULL;

   public Var call() throws Exception {
    pais = Var.valueOf(api.cronapi.CountryInfoServiceAPI.fullCountryInfo(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.BuscaSigla"))));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.BuscaCapital"), cronapi.object.Operations.getObjectField(pais, Var.valueOf("FullCountryInfoResult.sCapitalCity")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.MostraDDD"), cronapi.object.Operations.getObjectField(pais, Var.valueOf("FullCountryInfoResult.sPhoneCode")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.Idioma"), cronapi.object.Operations.getObjectField(pais, Var.valueOf("FullCountryInfoResult.sCurrencyISOCode")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("flag"), cronapi.object.Operations.getObjectField(pais, Var.valueOf("FullCountryInfoResult.sCountryFlag")));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("FullCountryInfoResult.sCountryFlag"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

