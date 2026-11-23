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

import org.dmtf.cim.CIM_USBRedirectionCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM USB Redirection Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBRedirectionCapabilitiesImpl#getConnectionModesSupported <em>Connection Modes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBRedirectionCapabilitiesImpl#getUSBVersionsSupported <em>USB Versions Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBRedirectionCapabilitiesImpl#getClassesSupported <em>Classes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBRedirectionCapabilitiesImpl#getSubClassesSupported <em>Sub Classes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBRedirectionCapabilitiesImpl#getMaxDevicesSupported <em>Max Devices Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBRedirectionCapabilitiesImpl#getMaxDevicesPerSAP <em>Max Devices Per SAP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBRedirectionCapabilitiesImpl#getSAPCapabilitiesSupported <em>SAP Capabilities Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBRedirectionCapabilitiesImpl#getRequestedStatesSupportedForCreatedSAP <em>Requested States Supported For Created SAP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBRedirectionCapabilitiesImpl#getInfoFormatsSupported <em>Info Formats Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBRedirectionCapabilitiesImpl#getSingleClassPerSAP <em>Single Class Per SAP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_USBRedirectionCapabilitiesImpl extends CIM_RedirectionServiceCapabilitiesImpl implements CIM_USBRedirectionCapabilities {
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
	 * The cached value of the '{@link #getUSBVersionsSupported() <em>USB Versions Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSBVersionsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> usbVersionsSupported;

	/**
	 * The cached value of the '{@link #getClassesSupported() <em>Classes Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> classesSupported;

	/**
	 * The cached value of the '{@link #getSubClassesSupported() <em>Sub Classes Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> subClassesSupported;

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
	 * The cached value of the '{@link #getRequestedStatesSupportedForCreatedSAP() <em>Requested States Supported For Created SAP</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedStatesSupportedForCreatedSAP()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> requestedStatesSupportedForCreatedSAP;

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
	 * The default value of the '{@link #getSingleClassPerSAP() <em>Single Class Per SAP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleClassPerSAP()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SINGLE_CLASS_PER_SAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingleClassPerSAP() <em>Single Class Per SAP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleClassPerSAP()
	 * @generated
	 * @ordered
	 */
	protected Boolean singleClassPerSAP = SINGLE_CLASS_PER_SAP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_USBRedirectionCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_USBRedirectionCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getConnectionModesSupported() {
		if (connectionModesSupported == null) {
			connectionModesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__CONNECTION_MODES_SUPPORTED);
		}
		return connectionModesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getUSBVersionsSupported() {
		if (usbVersionsSupported == null) {
			usbVersionsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__USB_VERSIONS_SUPPORTED);
		}
		return usbVersionsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getClassesSupported() {
		if (classesSupported == null) {
			classesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__CLASSES_SUPPORTED);
		}
		return classesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSubClassesSupported() {
		if (subClassesSupported == null) {
			subClassesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SUB_CLASSES_SUPPORTED);
		}
		return subClassesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMaxDevicesSupported() {
		if (maxDevicesSupported == null) {
			maxDevicesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__MAX_DEVICES_SUPPORTED);
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
			maxDevicesPerSAP = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__MAX_DEVICES_PER_SAP);
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
			sapCapabilitiesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SAP_CAPABILITIES_SUPPORTED);
		}
		return sapCapabilitiesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRequestedStatesSupportedForCreatedSAP() {
		if (requestedStatesSupportedForCreatedSAP == null) {
			requestedStatesSupportedForCreatedSAP = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__REQUESTED_STATES_SUPPORTED_FOR_CREATED_SAP);
		}
		return requestedStatesSupportedForCreatedSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getInfoFormatsSupported() {
		if (infoFormatsSupported == null) {
			infoFormatsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__INFO_FORMATS_SUPPORTED);
		}
		return infoFormatsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSingleClassPerSAP() {
		return singleClassPerSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingleClassPerSAP(Boolean newSingleClassPerSAP) {
		Boolean oldSingleClassPerSAP = singleClassPerSAP;
		singleClassPerSAP = newSingleClassPerSAP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SINGLE_CLASS_PER_SAP, oldSingleClassPerSAP, singleClassPerSAP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__CONNECTION_MODES_SUPPORTED:
				return getConnectionModesSupported();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__USB_VERSIONS_SUPPORTED:
				return getUSBVersionsSupported();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__CLASSES_SUPPORTED:
				return getClassesSupported();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SUB_CLASSES_SUPPORTED:
				return getSubClassesSupported();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__MAX_DEVICES_SUPPORTED:
				return getMaxDevicesSupported();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__MAX_DEVICES_PER_SAP:
				return getMaxDevicesPerSAP();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SAP_CAPABILITIES_SUPPORTED:
				return getSAPCapabilitiesSupported();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__REQUESTED_STATES_SUPPORTED_FOR_CREATED_SAP:
				return getRequestedStatesSupportedForCreatedSAP();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__INFO_FORMATS_SUPPORTED:
				return getInfoFormatsSupported();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SINGLE_CLASS_PER_SAP:
				return getSingleClassPerSAP();
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
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__CONNECTION_MODES_SUPPORTED:
				getConnectionModesSupported().clear();
				getConnectionModesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__USB_VERSIONS_SUPPORTED:
				getUSBVersionsSupported().clear();
				getUSBVersionsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__CLASSES_SUPPORTED:
				getClassesSupported().clear();
				getClassesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SUB_CLASSES_SUPPORTED:
				getSubClassesSupported().clear();
				getSubClassesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__MAX_DEVICES_SUPPORTED:
				getMaxDevicesSupported().clear();
				getMaxDevicesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__MAX_DEVICES_PER_SAP:
				getMaxDevicesPerSAP().clear();
				getMaxDevicesPerSAP().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SAP_CAPABILITIES_SUPPORTED:
				getSAPCapabilitiesSupported().clear();
				getSAPCapabilitiesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__REQUESTED_STATES_SUPPORTED_FOR_CREATED_SAP:
				getRequestedStatesSupportedForCreatedSAP().clear();
				getRequestedStatesSupportedForCreatedSAP().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__INFO_FORMATS_SUPPORTED:
				getInfoFormatsSupported().clear();
				getInfoFormatsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SINGLE_CLASS_PER_SAP:
				setSingleClassPerSAP((Boolean)newValue);
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
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__CONNECTION_MODES_SUPPORTED:
				getConnectionModesSupported().clear();
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__USB_VERSIONS_SUPPORTED:
				getUSBVersionsSupported().clear();
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__CLASSES_SUPPORTED:
				getClassesSupported().clear();
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SUB_CLASSES_SUPPORTED:
				getSubClassesSupported().clear();
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__MAX_DEVICES_SUPPORTED:
				getMaxDevicesSupported().clear();
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__MAX_DEVICES_PER_SAP:
				getMaxDevicesPerSAP().clear();
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SAP_CAPABILITIES_SUPPORTED:
				getSAPCapabilitiesSupported().clear();
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__REQUESTED_STATES_SUPPORTED_FOR_CREATED_SAP:
				getRequestedStatesSupportedForCreatedSAP().clear();
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__INFO_FORMATS_SUPPORTED:
				getInfoFormatsSupported().clear();
				return;
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SINGLE_CLASS_PER_SAP:
				setSingleClassPerSAP(SINGLE_CLASS_PER_SAP_EDEFAULT);
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
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__CONNECTION_MODES_SUPPORTED:
				return connectionModesSupported != null && !connectionModesSupported.isEmpty();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__USB_VERSIONS_SUPPORTED:
				return usbVersionsSupported != null && !usbVersionsSupported.isEmpty();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__CLASSES_SUPPORTED:
				return classesSupported != null && !classesSupported.isEmpty();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SUB_CLASSES_SUPPORTED:
				return subClassesSupported != null && !subClassesSupported.isEmpty();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__MAX_DEVICES_SUPPORTED:
				return maxDevicesSupported != null && !maxDevicesSupported.isEmpty();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__MAX_DEVICES_PER_SAP:
				return maxDevicesPerSAP != null && !maxDevicesPerSAP.isEmpty();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SAP_CAPABILITIES_SUPPORTED:
				return sapCapabilitiesSupported != null && !sapCapabilitiesSupported.isEmpty();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__REQUESTED_STATES_SUPPORTED_FOR_CREATED_SAP:
				return requestedStatesSupportedForCreatedSAP != null && !requestedStatesSupportedForCreatedSAP.isEmpty();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__INFO_FORMATS_SUPPORTED:
				return infoFormatsSupported != null && !infoFormatsSupported.isEmpty();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES__SINGLE_CLASS_PER_SAP:
				return SINGLE_CLASS_PER_SAP_EDEFAULT == null ? singleClassPerSAP != null : !SINGLE_CLASS_PER_SAP_EDEFAULT.equals(singleClassPerSAP);
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
		result.append(", USBVersionsSupported: ");
		result.append(usbVersionsSupported);
		result.append(", ClassesSupported: ");
		result.append(classesSupported);
		result.append(", SubClassesSupported: ");
		result.append(subClassesSupported);
		result.append(", MaxDevicesSupported: ");
		result.append(maxDevicesSupported);
		result.append(", MaxDevicesPerSAP: ");
		result.append(maxDevicesPerSAP);
		result.append(", SAPCapabilitiesSupported: ");
		result.append(sapCapabilitiesSupported);
		result.append(", RequestedStatesSupportedForCreatedSAP: ");
		result.append(requestedStatesSupportedForCreatedSAP);
		result.append(", InfoFormatsSupported: ");
		result.append(infoFormatsSupported);
		result.append(", SingleClassPerSAP: ");
		result.append(singleClassPerSAP);
		result.append(')');
		return result.toString();
	}

} //CIM_USBRedirectionCapabilitiesImpl
