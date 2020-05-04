
package pl.firstdata.wdx.business.card.v5;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.3
 * 2020-05-04T19:49:38.447+02:00
 * Generated source version: 3.3.3
 *
 */
public final class CardService_CardServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.firstdata.pl/wdx/business/card/v5/", "CardService");

    private CardService_CardServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CardService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        CardService_Service ss = new CardService_Service(wsdlURL, SERVICE_NAME);
        CardService port = ss.getCardServicePort();

        {
        System.out.println("Invoking activateCard...");
        pl.firstdata.wdx.business.card.CardActivationRequest _activateCard_activateCard = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _activateCard__return = port.activateCard(_activateCard_activateCard);
        System.out.println("activateCard.result=" + _activateCard__return);


        }
        {
        System.out.println("Invoking getCardStatus...");
        pl.firstdata.wdx.business.card.CardStatusRequest _getCardStatus_getCardStatus = null;
        pl.firstdata.wdx.business.card.CardStatus _getCardStatus__return = port.getCardStatus(_getCardStatus_getCardStatus);
        System.out.println("getCardStatus.result=" + _getCardStatus__return);


        }
        {
        System.out.println("Invoking manage3DsCard...");
        pl.firstdata.wdx.business.card.Manage3DsCardRequest _manage3DsCard_manage3DsCard = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _manage3DsCard__return = port.manage3DsCard(_manage3DsCard_manage3DsCard);
        System.out.println("manage3DsCard.result=" + _manage3DsCard__return);


        }
        {
        System.out.println("Invoking readCtls...");
        pl.firstdata.wdx.business.card.ReadCtlsRequest _readCtls_readCtls = null;
        pl.firstdata.wdx.business.card.ReadCtlsResponse _readCtls__return = port.readCtls(_readCtls_readCtls);
        System.out.println("readCtls.result=" + _readCtls__return);


        }
        {
        System.out.println("Invoking readLimits...");
        pl.firstdata.wdx.business.card.ReadLimitsRequest _readLimits_readLimits = null;
        pl.firstdata.wdx.business.card.ReadLimitsResponse _readLimits__return = port.readLimits(_readLimits_readLimits);
        System.out.println("readLimits.result=" + _readLimits__return);


        }
        {
        System.out.println("Invoking getUserDetails...");
        pl.firstdata.wdx.business.card.GetUserDetailsRequest _getUserDetails_getUserDetails = null;
        pl.firstdata.wdx.business.card.GetUserDetailsResponse _getUserDetails__return = port.getUserDetails(_getUserDetails_getUserDetails);
        System.out.println("getUserDetails.result=" + _getUserDetails__return);


        }
        {
        System.out.println("Invoking getBalance...");
        pl.firstdata.wdx.business.card.CardBalanceRequest _getBalance_getBalance = null;
        pl.firstdata.wdx.business.card.CardBalance _getBalance__return = port.getBalance(_getBalance_getBalance);
        System.out.println("getBalance.result=" + _getBalance__return);


        }
        {
        System.out.println("Invoking setCtls...");
        pl.firstdata.wdx.business.card.SetCtlsRequest _setCtls_setCtls = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _setCtls__return = port.setCtls(_setCtls_setCtls);
        System.out.println("setCtls.result=" + _setCtls__return);


        }
        {
        System.out.println("Invoking updateCardStatus...");
        pl.firstdata.wdx.business.card.CardStatusUpdateRequest _updateCardStatus_updateCardStatus = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _updateCardStatus__return = port.updateCardStatus(_updateCardStatus_updateCardStatus);
        System.out.println("updateCardStatus.result=" + _updateCardStatus__return);


        }
        {
        System.out.println("Invoking getToken...");
        pl.firstdata.wdx.business.card.GetTokenRequest _getToken_getToken = null;
        pl.firstdata.wdx.business.card.GetTokenResponse _getToken__return = port.getToken(_getToken_getToken);
        System.out.println("getToken.result=" + _getToken__return);


        }
        {
        System.out.println("Invoking manageCard...");
        pl.firstdata.wdx.business.card.ManageCardRequest _manageCard_manageCard = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _manageCard__return = port.manageCard(_manageCard_manageCard);
        System.out.println("manageCard.result=" + _manageCard__return);


        }
        {
        System.out.println("Invoking orderPin...");
        pl.firstdata.wdx.business.card.OrderPinRequest _orderPin_orderPin = null;
        pl.firstdata.wdx.business.card.CardIdResponse _orderPin__return = port.orderPin(_orderPin_orderPin);
        System.out.println("orderPin.result=" + _orderPin__return);


        }
        {
        System.out.println("Invoking changePhoneNumber...");
        pl.firstdata.wdx.business.card.ChangePhoneNumberRequest _changePhoneNumber_changePhoneNumber = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _changePhoneNumber__return = port.changePhoneNumber(_changePhoneNumber_changePhoneNumber);
        System.out.println("changePhoneNumber.result=" + _changePhoneNumber__return);


        }
        {
        System.out.println("Invoking accountManagement...");
        pl.firstdata.wdx.business.card.AccountManagementRequest _accountManagement_accountManagement = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _accountManagement__return = port.accountManagement(_accountManagement_accountManagement);
        System.out.println("accountManagement.result=" + _accountManagement__return);


        }
        {
        System.out.println("Invoking unblockPin...");
        pl.firstdata.wdx.business.card.UnblockPinRequest _unblockPin_unblockPin = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _unblockPin__return = port.unblockPin(_unblockPin_unblockPin);
        System.out.println("unblockPin.result=" + _unblockPin__return);


        }
        {
        System.out.println("Invoking updateIssuerQuestions...");
        pl.firstdata.wdx.business.card.UpdateIssuerQuestionsRequest _updateIssuerQuestions_updateIssuerQuestions = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _updateIssuerQuestions__return = port.updateIssuerQuestions(_updateIssuerQuestions_updateIssuerQuestions);
        System.out.println("updateIssuerQuestions.result=" + _updateIssuerQuestions__return);


        }
        {
        System.out.println("Invoking getUserDetailsPan...");
        pl.firstdata.wdx.business.card.GetUserDetailsPanRequest _getUserDetailsPan_getUserDetailsPan = null;
        pl.firstdata.wdx.business.card.GetUserDetailsResponse _getUserDetailsPan__return = port.getUserDetailsPan(_getUserDetailsPan_getUserDetailsPan);
        System.out.println("getUserDetailsPan.result=" + _getUserDetailsPan__return);


        }
        {
        System.out.println("Invoking cardIssuing...");
        pl.firstdata.wdx.business.card.CardIssuingRequest _cardIssuing_cardIssuing = null;
        pl.firstdata.wdx.business.card.CardIssuingResponse _cardIssuing__return = port.cardIssuing(_cardIssuing_cardIssuing);
        System.out.println("cardIssuing.result=" + _cardIssuing__return);


        }
        {
        System.out.println("Invoking blockCard...");
        pl.firstdata.wdx.business.card.BlockStatusCardRequest _blockCard_blockCard = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _blockCard__return = port.blockCard(_blockCard_blockCard);
        System.out.println("blockCard.result=" + _blockCard__return);


        }
        {
        System.out.println("Invoking setLimits...");
        pl.firstdata.wdx.business.card.SetLimitsRequest _setLimits_setLimits = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _setLimits__return = port.setLimits(_setLimits_setLimits);
        System.out.println("setLimits.result=" + _setLimits__return);


        }
        {
        System.out.println("Invoking unblockCard...");
        pl.firstdata.wdx.business.card.BlockStatusCardRequest _unblockCard_unblockCard = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _unblockCard__return = port.unblockCard(_unblockCard_unblockCard);
        System.out.println("unblockCard.result=" + _unblockCard__return);


        }
        {
        System.out.println("Invoking cancelEnrollment...");
        pl.firstdata.wdx.business.card.CancelEnrollmentRequest _cancelEnrollment_cancelEnrollment = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _cancelEnrollment__return = port.cancelEnrollment(_cancelEnrollment_cancelEnrollment);
        System.out.println("cancelEnrollment.result=" + _cancelEnrollment__return);


        }
        {
        System.out.println("Invoking sendAuthStatus...");
        pl.firstdata.wdx.business.card.SendAuthStatusRequest _sendAuthStatus_sendAuthStatus = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _sendAuthStatus__return = port.sendAuthStatus(_sendAuthStatus_sendAuthStatus);
        System.out.println("sendAuthStatus.result=" + _sendAuthStatus__return);


        }
        {
        System.out.println("Invoking enrollCard...");
        pl.firstdata.wdx.business.card.EnrollCardRequest _enrollCard_enrollCard = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _enrollCard__return = port.enrollCard(_enrollCard_enrollCard);
        System.out.println("enrollCard.result=" + _enrollCard__return);


        }
        {
        System.out.println("Invoking updateCrta...");
        pl.firstdata.wdx.business.card.UpdateCrtaRequest _updateCrta_updateCrta = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _updateCrta__return = port.updateCrta(_updateCrta_updateCrta);
        System.out.println("updateCrta.result=" + _updateCrta__return);


        }
        {
        System.out.println("Invoking enrollCH...");
        pl.firstdata.wdx.business.card.EnrollCHRequest _enrollCH_enrollCH = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _enrollCH__return = port.enrollCH(_enrollCH_enrollCH);
        System.out.println("enrollCH.result=" + _enrollCH__return);


        }
        {
        System.out.println("Invoking readCrta...");
        pl.firstdata.wdx.business.card.ReadCrtaRequest _readCrta_readCrta = null;
        pl.firstdata.wdx.business.card.CrtaResponse _readCrta__return = port.readCrta(_readCrta_readCrta);
        System.out.println("readCrta.result=" + _readCrta__return);


        }
        {
        System.out.println("Invoking readSecureCode...");
        pl.firstdata.wdx.business.card.ReadSecureCodeRequest _readSecureCode_readSecureCode = null;
        pl.firstdata.wdx.business.card.SecureCodeResult _readSecureCode__return = port.readSecureCode(_readSecureCode_readSecureCode);
        System.out.println("readSecureCode.result=" + _readSecureCode__return);


        }
        {
        System.out.println("Invoking readCardId...");
        pl.firstdata.wdx.business.card.ReadCardIdRequest _readCardId_readCardId = null;
        pl.firstdata.wdx.business.card.CardIdResponse _readCardId__return = port.readCardId(_readCardId_readCardId);
        System.out.println("readCardId.result=" + _readCardId__return);


        }
        {
        System.out.println("Invoking changeCardStatus...");
        pl.firstdata.wdx.business.card.CardStatusChangeRequest _changeCardStatus_changeCardStatus = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _changeCardStatus__return = port.changeCardStatus(_changeCardStatus_changeCardStatus);
        System.out.println("changeCardStatus.result=" + _changeCardStatus__return);


        }
        {
        System.out.println("Invoking cardAccountBinding...");
        pl.firstdata.wdx.business.card.CardAccountBindingRequest _cardAccountBinding_cardAccountBinding = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _cardAccountBinding__return = port.cardAccountBinding(_cardAccountBinding_cardAccountBinding);
        System.out.println("cardAccountBinding.result=" + _cardAccountBinding__return);


        }
        {
        System.out.println("Invoking setMonthlyLimits...");
        pl.firstdata.wdx.business.card.SetMonthlyLimitsRequest _setMonthlyLimits_setMonthlyLimits = null;
        pl.firstdata.wdx.business.card.v5.OperationResult _setMonthlyLimits__return = port.setMonthlyLimits(_setMonthlyLimits_setMonthlyLimits);
        System.out.println("setMonthlyLimits.result=" + _setMonthlyLimits__return);


        }

        System.exit(0);
    }

}
