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

import org.dmtf.cim.CIM_PrivilegeManagementCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Privilege Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrivilegeManagementCapabilitiesImpl#getSharedPrivilegeSupported <em>Shared Privilege Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrivilegeManagementCapabilitiesImpl#getActivitiesSupported <em>Activities Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrivilegeManagementCapabilitiesImpl#getActivityQualifiersSupported <em>Activity Qualifiers Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrivilegeManagementCapabilitiesImpl#getQualifierFormatsSupported <em>Qualifier Formats Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrivilegeManagementCapabilitiesImpl#getSupportedMethods <em>Supported Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PrivilegeManagementCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_PrivilegeManagementCapabilities {
	/**
	 * The default value of the '{@link #getSharedPrivilegeSupported() <em>Shared Privilege Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedPrivilegeSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHARED_PRIVILEGE_SUPPORTED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSharedPrivilegeSupported() <em>Shared Privilege Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedPrivilegeSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean sharedPrivilegeSupported = SHARED_PRIVILEGE_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivitiesSupported() <em>Activities Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitiesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> activitiesSupported;

	/**
	 * The cached value of the '{@link #getActivityQualifiersSupported() <em>Activity Qualifiers Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityQualifiersSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<String> activityQualifiersSupported;

	/**
	 * The cached value of the '{@link #getQualifierFormatsSupported() <em>Qualifier Formats Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierFormatsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> qualifierFormatsSupported;

	/**
	 * The cached value of the '{@link #getSupportedMethods() <em>Supported Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrivilegeManagementCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PrivilegeManagementCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSharedPrivilegeSupported() {
		return sharedPrivilegeSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharedPrivilegeSupported(Boolean newSharedPrivilegeSupported) {
		Boolean oldSharedPrivilegeSupported = sharedPrivilegeSupported;
		sharedPrivilegeSupported = newSharedPrivilegeSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__SHARED_PRIVILEGE_SUPPORTED, oldSharedPrivilegeSupported, sharedPrivilegeSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getActivitiesSupported() {
		if (activitiesSupported == null) {
			activitiesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__ACTIVITIES_SUPPORTED);
		}
		return activitiesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getActivityQualifiersSupported() {
		if (activityQualifiersSupported == null) {
			activityQualifiersSupported = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__ACTIVITY_QUALIFIERS_SUPPORTED);
		}
		return activityQualifiersSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getQualifierFormatsSupported() {
		if (qualifierFormatsSupported == null) {
			qualifierFormatsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__QUALIFIER_FORMATS_SUPPORTED);
		}
		return qualifierFormatsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedMethods() {
		if (supportedMethods == null) {
			supportedMethods = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS);
		}
		return supportedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__SHARED_PRIVILEGE_SUPPORTED:
				return getSharedPrivilegeSupported();
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__ACTIVITIES_SUPPORTED:
				return getActivitiesSupported();
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__ACTIVITY_QUALIFIERS_SUPPORTED:
				return getActivityQualifiersSupported();
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__QUALIFIER_FORMATS_SUPPORTED:
				return getQualifierFormatsSupported();
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				return getSupportedMethods();
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
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__SHARED_PRIVILEGE_SUPPORTED:
				setSharedPrivilegeSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__ACTIVITIES_SUPPORTED:
				getActivitiesSupported().clear();
				getActivitiesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__ACTIVITY_QUALIFIERS_SUPPORTED:
				getActivityQualifiersSupported().clear();
				getActivityQualifiersSupported().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__QUALIFIER_FORMATS_SUPPORTED:
				getQualifierFormatsSupported().clear();
				getQualifierFormatsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				getSupportedMethods().clear();
				getSupportedMethods().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__SHARED_PRIVILEGE_SUPPORTED:
				setSharedPrivilegeSupported(SHARED_PRIVILEGE_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__ACTIVITIES_SUPPORTED:
				getActivitiesSupported().clear();
				return;
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__ACTIVITY_QUALIFIERS_SUPPORTED:
				getActivityQualifiersSupported().clear();
				return;
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__QUALIFIER_FORMATS_SUPPORTED:
				getQualifierFormatsSupported().clear();
				return;
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				getSupportedMethods().clear();
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
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__SHARED_PRIVILEGE_SUPPORTED:
				return SHARED_PRIVILEGE_SUPPORTED_EDEFAULT == null ? sharedPrivilegeSupported != null : !SHARED_PRIVILEGE_SUPPORTED_EDEFAULT.equals(sharedPrivilegeSupported);
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__ACTIVITIES_SUPPORTED:
				return activitiesSupported != null && !activitiesSupported.isEmpty();
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__ACTIVITY_QUALIFIERS_SUPPORTED:
				return activityQualifiersSupported != null && !activityQualifiersSupported.isEmpty();
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__QUALIFIER_FORMATS_SUPPORTED:
				return qualifierFormatsSupported != null && !qualifierFormatsSupported.isEmpty();
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				return supportedMethods != null && !supportedMethods.isEmpty();
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
		result.append(" (SharedPrivilegeSupported: ");
		result.append(sharedPrivilegeSupported);
		result.append(", ActivitiesSupported: ");
		result.append(activitiesSupported);
		result.append(", ActivityQualifiersSupported: ");
		result.append(activityQualifiersSupported);
		result.append(", QualifierFormatsSupported: ");
		result.append(qualifierFormatsSupported);
		result.append(", SupportedMethods: ");
		result.append(supportedMethods);
		result.append(')');
		return result.toString();
	}

} //CIM_PrivilegeManagementCapabilitiesImpl
