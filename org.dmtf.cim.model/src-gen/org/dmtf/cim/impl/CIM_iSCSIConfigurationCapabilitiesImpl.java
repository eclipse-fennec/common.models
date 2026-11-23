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

import org.dmtf.cim.CIM_iSCSIConfigurationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM iSCSI Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConfigurationCapabilitiesImpl#getISCSIProtocolEndpointCreationSupported <em>ISCSI Protocol Endpoint Creation Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConfigurationCapabilitiesImpl#getIdentifierSelectionSupported <em>Identifier Selection Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSIConfigurationCapabilitiesImpl#getISCSINodeCreationSupported <em>ISCSI Node Creation Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_iSCSIConfigurationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_iSCSIConfigurationCapabilities {
	/**
	 * The default value of the '{@link #getISCSIProtocolEndpointCreationSupported() <em>ISCSI Protocol Endpoint Creation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISCSIProtocolEndpointCreationSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ISCSI_PROTOCOL_ENDPOINT_CREATION_SUPPORTED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getISCSIProtocolEndpointCreationSupported() <em>ISCSI Protocol Endpoint Creation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISCSIProtocolEndpointCreationSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean iSCSIProtocolEndpointCreationSupported = ISCSI_PROTOCOL_ENDPOINT_CREATION_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifierSelectionSupported() <em>Identifier Selection Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierSelectionSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IDENTIFIER_SELECTION_SUPPORTED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIdentifierSelectionSupported() <em>Identifier Selection Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierSelectionSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean identifierSelectionSupported = IDENTIFIER_SELECTION_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getISCSINodeCreationSupported() <em>ISCSI Node Creation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISCSINodeCreationSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ISCSI_NODE_CREATION_SUPPORTED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getISCSINodeCreationSupported() <em>ISCSI Node Creation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISCSINodeCreationSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean iSCSINodeCreationSupported = ISCSI_NODE_CREATION_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_iSCSIConfigurationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_iSCSIConfigurationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getISCSIProtocolEndpointCreationSupported() {
		return iSCSIProtocolEndpointCreationSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setISCSIProtocolEndpointCreationSupported(Boolean newISCSIProtocolEndpointCreationSupported) {
		Boolean oldISCSIProtocolEndpointCreationSupported = iSCSIProtocolEndpointCreationSupported;
		iSCSIProtocolEndpointCreationSupported = newISCSIProtocolEndpointCreationSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__ISCSI_PROTOCOL_ENDPOINT_CREATION_SUPPORTED, oldISCSIProtocolEndpointCreationSupported, iSCSIProtocolEndpointCreationSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIdentifierSelectionSupported() {
		return identifierSelectionSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifierSelectionSupported(Boolean newIdentifierSelectionSupported) {
		Boolean oldIdentifierSelectionSupported = identifierSelectionSupported;
		identifierSelectionSupported = newIdentifierSelectionSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__IDENTIFIER_SELECTION_SUPPORTED, oldIdentifierSelectionSupported, identifierSelectionSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getISCSINodeCreationSupported() {
		return iSCSINodeCreationSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setISCSINodeCreationSupported(Boolean newISCSINodeCreationSupported) {
		Boolean oldISCSINodeCreationSupported = iSCSINodeCreationSupported;
		iSCSINodeCreationSupported = newISCSINodeCreationSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__ISCSI_NODE_CREATION_SUPPORTED, oldISCSINodeCreationSupported, iSCSINodeCreationSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__ISCSI_PROTOCOL_ENDPOINT_CREATION_SUPPORTED:
				return getISCSIProtocolEndpointCreationSupported();
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__IDENTIFIER_SELECTION_SUPPORTED:
				return getIdentifierSelectionSupported();
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__ISCSI_NODE_CREATION_SUPPORTED:
				return getISCSINodeCreationSupported();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__ISCSI_PROTOCOL_ENDPOINT_CREATION_SUPPORTED:
				setISCSIProtocolEndpointCreationSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__IDENTIFIER_SELECTION_SUPPORTED:
				setIdentifierSelectionSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__ISCSI_NODE_CREATION_SUPPORTED:
				setISCSINodeCreationSupported((Boolean)newValue);
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
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__ISCSI_PROTOCOL_ENDPOINT_CREATION_SUPPORTED:
				setISCSIProtocolEndpointCreationSupported(ISCSI_PROTOCOL_ENDPOINT_CREATION_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__IDENTIFIER_SELECTION_SUPPORTED:
				setIdentifierSelectionSupported(IDENTIFIER_SELECTION_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__ISCSI_NODE_CREATION_SUPPORTED:
				setISCSINodeCreationSupported(ISCSI_NODE_CREATION_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__ISCSI_PROTOCOL_ENDPOINT_CREATION_SUPPORTED:
				return ISCSI_PROTOCOL_ENDPOINT_CREATION_SUPPORTED_EDEFAULT == null ? iSCSIProtocolEndpointCreationSupported != null : !ISCSI_PROTOCOL_ENDPOINT_CREATION_SUPPORTED_EDEFAULT.equals(iSCSIProtocolEndpointCreationSupported);
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__IDENTIFIER_SELECTION_SUPPORTED:
				return IDENTIFIER_SELECTION_SUPPORTED_EDEFAULT == null ? identifierSelectionSupported != null : !IDENTIFIER_SELECTION_SUPPORTED_EDEFAULT.equals(identifierSelectionSupported);
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES__ISCSI_NODE_CREATION_SUPPORTED:
				return ISCSI_NODE_CREATION_SUPPORTED_EDEFAULT == null ? iSCSINodeCreationSupported != null : !ISCSI_NODE_CREATION_SUPPORTED_EDEFAULT.equals(iSCSINodeCreationSupported);
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
		result.append(" (iSCSIProtocolEndpointCreationSupported: ");
		result.append(iSCSIProtocolEndpointCreationSupported);
		result.append(", IdentifierSelectionSupported: ");
		result.append(identifierSelectionSupported);
		result.append(", iSCSINodeCreationSupported: ");
		result.append(iSCSINodeCreationSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_iSCSIConfigurationCapabilitiesImpl
