/*******************************************************************************
 *
 *  Copyright FUJITSU LIMITED 2016
 *
 *  Author: Paulina Badziak
 *
 *  Creation Date: 30.08.2016
 *
 *******************************************************************************/
package org.oscm.internal.vo;

import org.oscm.internal.types.enumtypes.IdpSettingType;
import java.util.HashMap;
import java.util.Map;

import static org.oscm.internal.types.enumtypes.IdpSettingType.*;

public class VOTenant extends BaseVO {

    private String tenantId;
    private String description;
    private Map<IdpSettingType, String> tenantSettings;

    public VOTenant() {
        this.tenantSettings = new HashMap<>();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Map<IdpSettingType, String> getTenantSettings() {
        return tenantSettings;
    }

    public void setTenantSettings(
        Map<IdpSettingType, String> tenantSettings) {
        this.tenantSettings = tenantSettings;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIssuer() {
        return tenantSettings.get(SSO_ISSUER_ID);
    }

    public String getIDPURL() {
        return tenantSettings.get(SSO_IDP_URL);
    }

    public String getIdpHttpMethod() {
        return tenantSettings.get(SSO_IDP_AUTHENTICATION_REQUEST_HTTP_METHOD);
    }

    public String getSigningKeystorePass() {
        return tenantSettings.get(SSO_SIGNING_KEYSTORE_PASS);
    }

    public String getSigningKeyAlias() {
        return  tenantSettings.get(SSO_SIGNING_KEY_ALIAS);
    }

    public String getSigningKeystore() {
        return tenantSettings.get(SSO_SIGNING_KEYSTORE);
    }

    public String getLogoutURL() {
        return tenantSettings.get(SSO_LOGOUT_URL);
    }
}
