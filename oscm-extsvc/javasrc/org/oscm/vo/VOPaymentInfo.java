/*******************************************************************************
 *                                                                              
 *  Copyright FUJITSU LIMITED 2015                                        
 *       
 *  Creation Date: 2011-02-16                                                      
 *                                                                              
 *******************************************************************************/

package org.oscm.vo;

/**
 * Represents payment information which can be used, for example, when
 * subscribing to a service.
 * 
 */
public class VOPaymentInfo extends BaseVO {

    private static final long serialVersionUID = 2103823966943099962L;

    /**
     * The used payment type, e.g. credit card or invoice.
     */
    private VOPaymentType paymentType;

    /**
     * The identifier.
     */
    private String id;

    /**
     * The credit card provider or bank.
     */
    private String providerName;

    /**
     * The credit card or account number
     */
    private String accountNumber;

    /**
     * Retrieves the payment type for this payment information object.
     * 
     * @return the payment type
     */
    public VOPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the payment type for this payment information object.
     * 
     * @param paymentType
     *            the payment type
     */
    public void setPaymentType(VOPaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Sets the identifier of this payment information object.
     * 
     * @param id
     *            the payment information ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves the identifier of this payment information object.
     * 
     * @return the payment information ID
     */
    public String getId() {
        return id;
    }

    /**
     * Retrieves the provider for this payment information object. This setting
     * depends on the payment type. For payment by credit card, it is typically
     * the credit card provider. For direct debit, it could be the name or
     * routing code of the bank.
     * 
     * @return the provider
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the provider for this payment information object. This setting
     * depends on the payment type. For payment by credit card, it is typically
     * the credit card provider. For direct debit, it could be the name or
     * routing code of the bank.
     * 
     * @param providerName
     *            the provider
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Retrieves the account or card number for this payment information object.
     * This setting depends on the payment type. For payment by credit card, it
     * is typically the credit card number. For direct debit, it usually is the
     * account number.
     * 
     * @return the account or card number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the account or card number for this payment information object. This
     * setting depends on the payment type. For payment by credit card, it is
     * typically the credit card number. For direct debit, it usually is the
     * account number.
     * 
     * @param accountNumber
     *            the account or card number
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}