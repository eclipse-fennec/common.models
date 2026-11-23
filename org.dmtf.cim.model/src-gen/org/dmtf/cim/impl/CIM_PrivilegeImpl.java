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

import org.dmtf.cim.CIM_Privilege;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Privilege</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrivilegeImpl#getPrivilegeGranted <em>Privilege Granted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrivilegeImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrivilegeImpl#getActivityQualifiers <em>Activity Qualifiers</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrivilegeImpl#getQualifierFormats <em>Qualifier Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrivilegeImpl#getRepresentsAuthorizationRights <em>Represents Authorization Rights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PrivilegeImpl extends CIM_ManagedElementImpl implements CIM_Privilege {
	/**
	 * The default value of the '{@link #getPrivilegeGranted() <em>Privilege Granted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeGranted()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIVILEGE_GRANTED_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPrivilegeGranted() <em>Privilege Granted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeGranted()
	 * @generated
	 * @ordered
	 */
	protected Boolean privilegeGranted = PRIVILEGE_GRANTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> activities;

	/**
	 * The cached value of the '{@link #getActivityQualifiers() <em>Activity Qualifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> activityQualifiers;

	/**
	 * The cached value of the '{@link #getQualifierFormats() <em>Qualifier Formats</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> qualifierFormats;

	/**
	 * The default value of the '{@link #getRepresentsAuthorizationRights() <em>Represents Authorization Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentsAuthorizationRights()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REPRESENTS_AUTHORIZATION_RIGHTS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRepresentsAuthorizationRights() <em>Represents Authorization Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentsAuthorizationRights()
	 * @generated
	 * @ordered
	 */
	protected Boolean representsAuthorizationRights = REPRESENTS_AUTHORIZATION_RIGHTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrivilegeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Privilege();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPrivilegeGranted() {
		return privilegeGranted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivilegeGranted(Boolean newPrivilegeGranted) {
		Boolean oldPrivilegeGranted = privilegeGranted;
		privilegeGranted = newPrivilegeGranted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRIVILEGE__PRIVILEGE_GRANTED, oldPrivilegeGranted, privilegeGranted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getActivities() {
		if (activities == null) {
			activities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRIVILEGE__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getActivityQualifiers() {
		if (activityQualifiers == null) {
			activityQualifiers = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRIVILEGE__ACTIVITY_QUALIFIERS);
		}
		return activityQualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getQualifierFormats() {
		if (qualifierFormats == null) {
			qualifierFormats = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRIVILEGE__QUALIFIER_FORMATS);
		}
		return qualifierFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRepresentsAuthorizationRights() {
		return representsAuthorizationRights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepresentsAuthorizationRights(Boolean newRepresentsAuthorizationRights) {
		Boolean oldRepresentsAuthorizationRights = representsAuthorizationRights;
		representsAuthorizationRights = newRepresentsAuthorizationRights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRIVILEGE__REPRESENTS_AUTHORIZATION_RIGHTS, oldRepresentsAuthorizationRights, representsAuthorizationRights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRIVILEGE__PRIVILEGE_GRANTED:
				return getPrivilegeGranted();
			case CimPackage.CIM_PRIVILEGE__ACTIVITIES:
				return getActivities();
			case CimPackage.CIM_PRIVILEGE__ACTIVITY_QUALIFIERS:
				return getActivityQualifiers();
			case CimPackage.CIM_PRIVILEGE__QUALIFIER_FORMATS:
				return getQualifierFormats();
			case CimPackage.CIM_PRIVILEGE__REPRESENTS_AUTHORIZATION_RIGHTS:
				return getRepresentsAuthorizationRights();
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
			case CimPackage.CIM_PRIVILEGE__PRIVILEGE_GRANTED:
				setPrivilegeGranted((Boolean)newValue);
				return;
			case CimPackage.CIM_PRIVILEGE__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRIVILEGE__ACTIVITY_QUALIFIERS:
				getActivityQualifiers().clear();
				getActivityQualifiers().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRIVILEGE__QUALIFIER_FORMATS:
				getQualifierFormats().clear();
				getQualifierFormats().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRIVILEGE__REPRESENTS_AUTHORIZATION_RIGHTS:
				setRepresentsAuthorizationRights((Boolean)newValue);
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
			case CimPackage.CIM_PRIVILEGE__PRIVILEGE_GRANTED:
				setPrivilegeGranted(PRIVILEGE_GRANTED_EDEFAULT);
				return;
			case CimPackage.CIM_PRIVILEGE__ACTIVITIES:
				getActivities().clear();
				return;
			case CimPackage.CIM_PRIVILEGE__ACTIVITY_QUALIFIERS:
				getActivityQualifiers().clear();
				return;
			case CimPackage.CIM_PRIVILEGE__QUALIFIER_FORMATS:
				getQualifierFormats().clear();
				return;
			case CimPackage.CIM_PRIVILEGE__REPRESENTS_AUTHORIZATION_RIGHTS:
				setRepresentsAuthorizationRights(REPRESENTS_AUTHORIZATION_RIGHTS_EDEFAULT);
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
			case CimPackage.CIM_PRIVILEGE__PRIVILEGE_GRANTED:
				return PRIVILEGE_GRANTED_EDEFAULT == null ? privilegeGranted != null : !PRIVILEGE_GRANTED_EDEFAULT.equals(privilegeGranted);
			case CimPackage.CIM_PRIVILEGE__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case CimPackage.CIM_PRIVILEGE__ACTIVITY_QUALIFIERS:
				return activityQualifiers != null && !activityQualifiers.isEmpty();
			case CimPackage.CIM_PRIVILEGE__QUALIFIER_FORMATS:
				return qualifierFormats != null && !qualifierFormats.isEmpty();
			case CimPackage.CIM_PRIVILEGE__REPRESENTS_AUTHORIZATION_RIGHTS:
				return REPRESENTS_AUTHORIZATION_RIGHTS_EDEFAULT == null ? representsAuthorizationRights != null : !REPRESENTS_AUTHORIZATION_RIGHTS_EDEFAULT.equals(representsAuthorizationRights);
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
		result.append(" (PrivilegeGranted: ");
		result.append(privilegeGranted);
		result.append(", Activities: ");
		result.append(activities);
		result.append(", ActivityQualifiers: ");
		result.append(activityQualifiers);
		result.append(", QualifierFormats: ");
		result.append(qualifierFormats);
		result.append(", RepresentsAuthorizationRights: ");
		result.append(representsAuthorizationRights);
		result.append(')');
		return result.toString();
	}

} //CIM_PrivilegeImpl
