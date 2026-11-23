/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim.impl;

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_Credential;
import org.dmtf.cim.CIM_IEEE8021xSettings;
import org.dmtf.cim.CIM_WiFiEndpoint;
import org.dmtf.cim.CIM_WiFiEndpointSettings;
import org.dmtf.cim.CIM_WiFiPortConfigurationService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Wi Fi Port Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_WiFiPortConfigurationServiceImpl extends CIM_NetworkPortConfigurationServiceImpl implements CIM_WiFiPortConfigurationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WiFiPortConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WiFiPortConfigurationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AddWiFiSettings(CIM_WiFiEndpoint WiFiEndpoint, String WiFiEndpointSettingsInput, String IEEE8021xSettingsInput, CIM_Credential ClientCredential, CIM_Credential CACredential, CIM_WiFiEndpointSettings WiFiEndpointSettings, CIM_IEEE8021xSettings IEEE8021xSettings) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long UpdateWiFiSettings(CIM_WiFiEndpointSettings WiFiEndpointSettings, String WiFiEndpointSettingsInput, String IEEE8021xSettingsInput, CIM_Credential ClientCredential, CIM_Credential CACredential, CIM_IEEE8021xSettings IEEE8021xSettings) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_WI_FI_PORT_CONFIGURATION_SERVICE___ADD_WI_FI_SETTINGS__CIM_WIFIENDPOINT_STRING_STRING_CIM_CREDENTIAL_CIM_CREDENTIAL_CIM_WIFIENDPOINTSETTINGS_CIM_IEEE8021XSETTINGS:
				return AddWiFiSettings((CIM_WiFiEndpoint)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (CIM_Credential)arguments.get(3), (CIM_Credential)arguments.get(4), (CIM_WiFiEndpointSettings)arguments.get(5), (CIM_IEEE8021xSettings)arguments.get(6));
			case CimPackage.CIM_WI_FI_PORT_CONFIGURATION_SERVICE___UPDATE_WI_FI_SETTINGS__CIM_WIFIENDPOINTSETTINGS_STRING_STRING_CIM_CREDENTIAL_CIM_CREDENTIAL_CIM_IEEE8021XSETTINGS:
				return UpdateWiFiSettings((CIM_WiFiEndpointSettings)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (CIM_Credential)arguments.get(3), (CIM_Credential)arguments.get(4), (CIM_IEEE8021xSettings)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_WiFiPortConfigurationServiceImpl
