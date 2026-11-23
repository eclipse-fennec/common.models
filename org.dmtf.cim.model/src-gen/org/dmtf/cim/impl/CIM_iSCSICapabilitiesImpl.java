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

import org.dmtf.cim.CIM_iSCSICapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM iSCSI Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSICapabilitiesImpl#getMinimumSpecificationVersionSupported <em>Minimum Specification Version Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSICapabilitiesImpl#getMaximumSpecificationVersionSupported <em>Maximum Specification Version Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSICapabilitiesImpl#getAuthenticationMethodsSupported <em>Authentication Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSICapabilitiesImpl#getOtherSupportedFeatures <em>Other Supported Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSICapabilitiesImpl#getSupportedFeatures <em>Supported Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_iSCSICapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_iSCSICapabilities {
	/**
	 * The default value of the '{@link #getMinimumSpecificationVersionSupported() <em>Minimum Specification Version Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSpecificationVersionSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINIMUM_SPECIFICATION_VERSION_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumSpecificationVersionSupported() <em>Minimum Specification Version Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSpecificationVersionSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer minimumSpecificationVersionSupported = MINIMUM_SPECIFICATION_VERSION_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumSpecificationVersionSupported() <em>Maximum Specification Version Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSpecificationVersionSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_SPECIFICATION_VERSION_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumSpecificationVersionSupported() <em>Maximum Specification Version Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSpecificationVersionSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumSpecificationVersionSupported = MAXIMUM_SPECIFICATION_VERSION_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthenticationMethodsSupported() <em>Authentication Methods Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMethodsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> authenticationMethodsSupported;

	/**
	 * The cached value of the '{@link #getOtherSupportedFeatures() <em>Other Supported Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedFeatures;

	/**
	 * The cached value of the '{@link #getSupportedFeatures() <em>Supported Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_iSCSICapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_iSCSICapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinimumSpecificationVersionSupported() {
		return minimumSpecificationVersionSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumSpecificationVersionSupported(Integer newMinimumSpecificationVersionSupported) {
		Integer oldMinimumSpecificationVersionSupported = minimumSpecificationVersionSupported;
		minimumSpecificationVersionSupported = newMinimumSpecificationVersionSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CAPABILITIES__MINIMUM_SPECIFICATION_VERSION_SUPPORTED, oldMinimumSpecificationVersionSupported, minimumSpecificationVersionSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumSpecificationVersionSupported() {
		return maximumSpecificationVersionSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumSpecificationVersionSupported(Integer newMaximumSpecificationVersionSupported) {
		Integer oldMaximumSpecificationVersionSupported = maximumSpecificationVersionSupported;
		maximumSpecificationVersionSupported = newMaximumSpecificationVersionSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_CAPABILITIES__MAXIMUM_SPECIFICATION_VERSION_SUPPORTED, oldMaximumSpecificationVersionSupported, maximumSpecificationVersionSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAuthenticationMethodsSupported() {
		if (authenticationMethodsSupported == null) {
			authenticationMethodsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ISCSI_CAPABILITIES__AUTHENTICATION_METHODS_SUPPORTED);
		}
		return authenticationMethodsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedFeatures() {
		if (otherSupportedFeatures == null) {
			otherSupportedFeatures = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ISCSI_CAPABILITIES__OTHER_SUPPORTED_FEATURES);
		}
		return otherSupportedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedFeatures() {
		if (supportedFeatures == null) {
			supportedFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ISCSI_CAPABILITIES__SUPPORTED_FEATURES);
		}
		return supportedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ISCSI_CAPABILITIES__MINIMUM_SPECIFICATION_VERSION_SUPPORTED:
				return getMinimumSpecificationVersionSupported();
			case CimPackage.CIM_ISCSI_CAPABILITIES__MAXIMUM_SPECIFICATION_VERSION_SUPPORTED:
				return getMaximumSpecificationVersionSupported();
			case CimPackage.CIM_ISCSI_CAPABILITIES__AUTHENTICATION_METHODS_SUPPORTED:
				return getAuthenticationMethodsSupported();
			case CimPackage.CIM_ISCSI_CAPABILITIES__OTHER_SUPPORTED_FEATURES:
				return getOtherSupportedFeatures();
			case CimPackage.CIM_ISCSI_CAPABILITIES__SUPPORTED_FEATURES:
				return getSupportedFeatures();
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
			case CimPackage.CIM_ISCSI_CAPABILITIES__MINIMUM_SPECIFICATION_VERSION_SUPPORTED:
				setMinimumSpecificationVersionSupported((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_CAPABILITIES__MAXIMUM_SPECIFICATION_VERSION_SUPPORTED:
				setMaximumSpecificationVersionSupported((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_CAPABILITIES__AUTHENTICATION_METHODS_SUPPORTED:
				getAuthenticationMethodsSupported().clear();
				getAuthenticationMethodsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ISCSI_CAPABILITIES__OTHER_SUPPORTED_FEATURES:
				getOtherSupportedFeatures().clear();
				getOtherSupportedFeatures().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ISCSI_CAPABILITIES__SUPPORTED_FEATURES:
				getSupportedFeatures().clear();
				getSupportedFeatures().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_ISCSI_CAPABILITIES__MINIMUM_SPECIFICATION_VERSION_SUPPORTED:
				setMinimumSpecificationVersionSupported(MINIMUM_SPECIFICATION_VERSION_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CAPABILITIES__MAXIMUM_SPECIFICATION_VERSION_SUPPORTED:
				setMaximumSpecificationVersionSupported(MAXIMUM_SPECIFICATION_VERSION_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_CAPABILITIES__AUTHENTICATION_METHODS_SUPPORTED:
				getAuthenticationMethodsSupported().clear();
				return;
			case CimPackage.CIM_ISCSI_CAPABILITIES__OTHER_SUPPORTED_FEATURES:
				getOtherSupportedFeatures().clear();
				return;
			case CimPackage.CIM_ISCSI_CAPABILITIES__SUPPORTED_FEATURES:
				getSupportedFeatures().clear();
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
			case CimPackage.CIM_ISCSI_CAPABILITIES__MINIMUM_SPECIFICATION_VERSION_SUPPORTED:
				return MINIMUM_SPECIFICATION_VERSION_SUPPORTED_EDEFAULT == null ? minimumSpecificationVersionSupported != null : !MINIMUM_SPECIFICATION_VERSION_SUPPORTED_EDEFAULT.equals(minimumSpecificationVersionSupported);
			case CimPackage.CIM_ISCSI_CAPABILITIES__MAXIMUM_SPECIFICATION_VERSION_SUPPORTED:
				return MAXIMUM_SPECIFICATION_VERSION_SUPPORTED_EDEFAULT == null ? maximumSpecificationVersionSupported != null : !MAXIMUM_SPECIFICATION_VERSION_SUPPORTED_EDEFAULT.equals(maximumSpecificationVersionSupported);
			case CimPackage.CIM_ISCSI_CAPABILITIES__AUTHENTICATION_METHODS_SUPPORTED:
				return authenticationMethodsSupported != null && !authenticationMethodsSupported.isEmpty();
			case CimPackage.CIM_ISCSI_CAPABILITIES__OTHER_SUPPORTED_FEATURES:
				return otherSupportedFeatures != null && !otherSupportedFeatures.isEmpty();
			case CimPackage.CIM_ISCSI_CAPABILITIES__SUPPORTED_FEATURES:
				return supportedFeatures != null && !supportedFeatures.isEmpty();
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
		result.append(" (MinimumSpecificationVersionSupported: ");
		result.append(minimumSpecificationVersionSupported);
		result.append(", MaximumSpecificationVersionSupported: ");
		result.append(maximumSpecificationVersionSupported);
		result.append(", AuthenticationMethodsSupported: ");
		result.append(authenticationMethodsSupported);
		result.append(", OtherSupportedFeatures: ");
		result.append(otherSupportedFeatures);
		result.append(", SupportedFeatures: ");
		result.append(supportedFeatures);
		result.append(')');
		return result.toString();
	}

} //CIM_iSCSICapabilitiesImpl
