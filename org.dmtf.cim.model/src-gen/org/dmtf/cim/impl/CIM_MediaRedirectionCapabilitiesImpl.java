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

import java.util.Collection;

import org.dmtf.cim.CIM_MediaRedirectionCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Media Redirection Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaRedirectionCapabilitiesImpl#getConnectionModesSupported <em>Connection Modes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaRedirectionCapabilitiesImpl#getDevicesSupported <em>Devices Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaRedirectionCapabilitiesImpl#getMaxDevicesSupported <em>Max Devices Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaRedirectionCapabilitiesImpl#getMaxDevicesPerSAP <em>Max Devices Per SAP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaRedirectionCapabilitiesImpl#getSAPCapabilitiesSupported <em>SAP Capabilities Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaRedirectionCapabilitiesImpl#getInfoFormatsSupported <em>Info Formats Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MediaRedirectionCapabilitiesImpl extends CIM_RedirectionServiceCapabilitiesImpl implements CIM_MediaRedirectionCapabilities {
	/**
	 * The cached value of the '{@link #getConnectionModesSupported() <em>Connection Modes Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionModesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> connectionModesSupported;

	/**
	 * The cached value of the '{@link #getDevicesSupported() <em>Devices Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> devicesSupported;

	/**
	 * The cached value of the '{@link #getMaxDevicesSupported() <em>Max Devices Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDevicesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> maxDevicesSupported;

	/**
	 * The cached value of the '{@link #getMaxDevicesPerSAP() <em>Max Devices Per SAP</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDevicesPerSAP()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> maxDevicesPerSAP;

	/**
	 * The cached value of the '{@link #getSAPCapabilitiesSupported() <em>SAP Capabilities Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAPCapabilitiesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sapCapabilitiesSupported;

	/**
	 * The cached value of the '{@link #getInfoFormatsSupported() <em>Info Formats Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoFormatsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> infoFormatsSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MediaRedirectionCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MediaRedirectionCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getConnectionModesSupported() {
		if (connectionModesSupported == null) {
			connectionModesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__CONNECTION_MODES_SUPPORTED);
		}
		return connectionModesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDevicesSupported() {
		if (devicesSupported == null) {
			devicesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__DEVICES_SUPPORTED);
		}
		return devicesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMaxDevicesSupported() {
		if (maxDevicesSupported == null) {
			maxDevicesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__MAX_DEVICES_SUPPORTED);
		}
		return maxDevicesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMaxDevicesPerSAP() {
		if (maxDevicesPerSAP == null) {
			maxDevicesPerSAP = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__MAX_DEVICES_PER_SAP);
		}
		return maxDevicesPerSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSAPCapabilitiesSupported() {
		if (sapCapabilitiesSupported == null) {
			sapCapabilitiesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__SAP_CAPABILITIES_SUPPORTED);
		}
		return sapCapabilitiesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getInfoFormatsSupported() {
		if (infoFormatsSupported == null) {
			infoFormatsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__INFO_FORMATS_SUPPORTED);
		}
		return infoFormatsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__CONNECTION_MODES_SUPPORTED:
				return getConnectionModesSupported();
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__DEVICES_SUPPORTED:
				return getDevicesSupported();
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__MAX_DEVICES_SUPPORTED:
				return getMaxDevicesSupported();
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__MAX_DEVICES_PER_SAP:
				return getMaxDevicesPerSAP();
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__SAP_CAPABILITIES_SUPPORTED:
				return getSAPCapabilitiesSupported();
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__INFO_FORMATS_SUPPORTED:
				return getInfoFormatsSupported();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__CONNECTION_MODES_SUPPORTED:
				getConnectionModesSupported().clear();
				getConnectionModesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__DEVICES_SUPPORTED:
				getDevicesSupported().clear();
				getDevicesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__MAX_DEVICES_SUPPORTED:
				getMaxDevicesSupported().clear();
				getMaxDevicesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__MAX_DEVICES_PER_SAP:
				getMaxDevicesPerSAP().clear();
				getMaxDevicesPerSAP().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__SAP_CAPABILITIES_SUPPORTED:
				getSAPCapabilitiesSupported().clear();
				getSAPCapabilitiesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__INFO_FORMATS_SUPPORTED:
				getInfoFormatsSupported().clear();
				getInfoFormatsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__CONNECTION_MODES_SUPPORTED:
				getConnectionModesSupported().clear();
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__DEVICES_SUPPORTED:
				getDevicesSupported().clear();
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__MAX_DEVICES_SUPPORTED:
				getMaxDevicesSupported().clear();
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__MAX_DEVICES_PER_SAP:
				getMaxDevicesPerSAP().clear();
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__SAP_CAPABILITIES_SUPPORTED:
				getSAPCapabilitiesSupported().clear();
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__INFO_FORMATS_SUPPORTED:
				getInfoFormatsSupported().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__CONNECTION_MODES_SUPPORTED:
				return connectionModesSupported != null && !connectionModesSupported.isEmpty();
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__DEVICES_SUPPORTED:
				return devicesSupported != null && !devicesSupported.isEmpty();
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__MAX_DEVICES_SUPPORTED:
				return maxDevicesSupported != null && !maxDevicesSupported.isEmpty();
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__MAX_DEVICES_PER_SAP:
				return maxDevicesPerSAP != null && !maxDevicesPerSAP.isEmpty();
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__SAP_CAPABILITIES_SUPPORTED:
				return sapCapabilitiesSupported != null && !sapCapabilitiesSupported.isEmpty();
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES__INFO_FORMATS_SUPPORTED:
				return infoFormatsSupported != null && !infoFormatsSupported.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ConnectionModesSupported: ");
		result.append(connectionModesSupported);
		result.append(", DevicesSupported: ");
		result.append(devicesSupported);
		result.append(", MaxDevicesSupported: ");
		result.append(maxDevicesSupported);
		result.append(", MaxDevicesPerSAP: ");
		result.append(maxDevicesPerSAP);
		result.append(", SAPCapabilitiesSupported: ");
		result.append(sapCapabilitiesSupported);
		result.append(", InfoFormatsSupported: ");
		result.append(infoFormatsSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_MediaRedirectionCapabilitiesImpl
