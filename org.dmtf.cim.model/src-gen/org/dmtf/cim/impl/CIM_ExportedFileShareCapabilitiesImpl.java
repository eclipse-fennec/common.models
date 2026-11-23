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

import java.util.Collection;

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_ExportedFileShareCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Exported File Share Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareCapabilitiesImpl#getFileSharingProtocol <em>File Sharing Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareCapabilitiesImpl#getProtocolVersions <em>Protocol Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareCapabilitiesImpl#getSupportedProperties <em>Supported Properties</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExportedFileShareCapabilitiesImpl#getCASupported <em>CA Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ExportedFileShareCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_ExportedFileShareCapabilities {
	/**
	 * The default value of the '{@link #getFileSharingProtocol() <em>File Sharing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSharingProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FILE_SHARING_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSharingProtocol() <em>File Sharing Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSharingProtocol()
	 * @generated
	 * @ordered
	 */
	protected Integer fileSharingProtocol = FILE_SHARING_PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtocolVersions() <em>Protocol Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> protocolVersions;

	/**
	 * The cached value of the '{@link #getSupportedProperties() <em>Supported Properties</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedProperties;

	/**
	 * The default value of the '{@link #getCASupported() <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CA_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCASupported() <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean caSupported = CA_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ExportedFileShareCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ExportedFileShareCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFileSharingProtocol() {
		return fileSharingProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSharingProtocol(Integer newFileSharingProtocol) {
		Integer oldFileSharingProtocol = fileSharingProtocol;
		fileSharingProtocol = newFileSharingProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__FILE_SHARING_PROTOCOL, oldFileSharingProtocol, fileSharingProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProtocolVersions() {
		if (protocolVersions == null) {
			protocolVersions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__PROTOCOL_VERSIONS);
		}
		return protocolVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedProperties() {
		if (supportedProperties == null) {
			supportedProperties = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__SUPPORTED_PROPERTIES);
		}
		return supportedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCASupported() {
		return caSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCASupported(Boolean newCASupported) {
		Boolean oldCASupported = caSupported;
		caSupported = newCASupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__CA_SUPPORTED, oldCASupported, caSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer CreateGoal(CIM_ConcreteJob Job, String TemplateGoal, String SupportedGoal) {
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
	public Long GetElementNameCapabilities(EList<Integer> SupportedFeatures, Integer MaxElementNameLen, String ElementNameMask) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__FILE_SHARING_PROTOCOL:
				return getFileSharingProtocol();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__PROTOCOL_VERSIONS:
				return getProtocolVersions();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__SUPPORTED_PROPERTIES:
				return getSupportedProperties();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__CA_SUPPORTED:
				return getCASupported();
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
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__FILE_SHARING_PROTOCOL:
				setFileSharingProtocol((Integer)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__PROTOCOL_VERSIONS:
				getProtocolVersions().clear();
				getProtocolVersions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__SUPPORTED_PROPERTIES:
				getSupportedProperties().clear();
				getSupportedProperties().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__CA_SUPPORTED:
				setCASupported((Boolean)newValue);
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
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__FILE_SHARING_PROTOCOL:
				setFileSharingProtocol(FILE_SHARING_PROTOCOL_EDEFAULT);
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__PROTOCOL_VERSIONS:
				getProtocolVersions().clear();
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__SUPPORTED_PROPERTIES:
				getSupportedProperties().clear();
				return;
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__CA_SUPPORTED:
				setCASupported(CA_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__FILE_SHARING_PROTOCOL:
				return FILE_SHARING_PROTOCOL_EDEFAULT == null ? fileSharingProtocol != null : !FILE_SHARING_PROTOCOL_EDEFAULT.equals(fileSharingProtocol);
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__PROTOCOL_VERSIONS:
				return protocolVersions != null && !protocolVersions.isEmpty();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__SUPPORTED_PROPERTIES:
				return supportedProperties != null && !supportedProperties.isEmpty();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES__CA_SUPPORTED:
				return CA_SUPPORTED_EDEFAULT == null ? caSupported != null : !CA_SUPPORTED_EDEFAULT.equals(caSupported);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES___CREATE_GOAL__CIM_CONCRETEJOB_STRING_STRING:
				return CreateGoal((CIM_ConcreteJob)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES___GET_ELEMENT_NAME_CAPABILITIES__ELIST_INTEGER_STRING:
				return GetElementNameCapabilities((EList<Integer>)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (FileSharingProtocol: ");
		result.append(fileSharingProtocol);
		result.append(", ProtocolVersions: ");
		result.append(protocolVersions);
		result.append(", SupportedProperties: ");
		result.append(supportedProperties);
		result.append(", CASupported: ");
		result.append(caSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_ExportedFileShareCapabilitiesImpl
