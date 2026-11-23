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

import org.dmtf.cim.CIM_AssociatedPrivilege;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Associated Privilege</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPrivilegeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPrivilegeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPrivilegeImpl#getUseKey <em>Use Key</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPrivilegeImpl#getPrivilegeGranted <em>Privilege Granted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPrivilegeImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPrivilegeImpl#getActivityQualifiers <em>Activity Qualifiers</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPrivilegeImpl#getQualifierFormats <em>Qualifier Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPrivilegeImpl#getRepresentsAuthorizationRights <em>Represents Authorization Rights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AssociatedPrivilegeImpl extends MinimalEObjectImpl.Container implements CIM_AssociatedPrivilege {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement subject;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement target;

	/**
	 * The default value of the '{@link #getUseKey() <em>Use Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseKey()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseKey() <em>Use Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseKey()
	 * @generated
	 * @ordered
	 */
	protected String useKey = USE_KEY_EDEFAULT;

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
	protected CIM_AssociatedPrivilegeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AssociatedPrivilege();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (CIM_ManagedElement)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ASSOCIATED_PRIVILEGE__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(CIM_ManagedElement newSubject) {
		CIM_ManagedElement oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_PRIVILEGE__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (CIM_ManagedElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ASSOCIATED_PRIVILEGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(CIM_ManagedElement newTarget) {
		CIM_ManagedElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_PRIVILEGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseKey() {
		return useKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseKey(String newUseKey) {
		String oldUseKey = useKey;
		useKey = newUseKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_PRIVILEGE__USE_KEY, oldUseKey, useKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_PRIVILEGE__PRIVILEGE_GRANTED, oldPrivilegeGranted, privilegeGranted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getActivities() {
		if (activities == null) {
			activities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ASSOCIATED_PRIVILEGE__ACTIVITIES);
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
			activityQualifiers = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ASSOCIATED_PRIVILEGE__ACTIVITY_QUALIFIERS);
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
			qualifierFormats = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ASSOCIATED_PRIVILEGE__QUALIFIER_FORMATS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_PRIVILEGE__REPRESENTS_AUTHORIZATION_RIGHTS, oldRepresentsAuthorizationRights, representsAuthorizationRights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__USE_KEY:
				return getUseKey();
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__PRIVILEGE_GRANTED:
				return getPrivilegeGranted();
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__ACTIVITIES:
				return getActivities();
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__ACTIVITY_QUALIFIERS:
				return getActivityQualifiers();
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__QUALIFIER_FORMATS:
				return getQualifierFormats();
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__REPRESENTS_AUTHORIZATION_RIGHTS:
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
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__SUBJECT:
				setSubject((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__TARGET:
				setTarget((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__USE_KEY:
				setUseKey((String)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__PRIVILEGE_GRANTED:
				setPrivilegeGranted((Boolean)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__ACTIVITY_QUALIFIERS:
				getActivityQualifiers().clear();
				getActivityQualifiers().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__QUALIFIER_FORMATS:
				getQualifierFormats().clear();
				getQualifierFormats().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__REPRESENTS_AUTHORIZATION_RIGHTS:
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
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__SUBJECT:
				setSubject((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__TARGET:
				setTarget((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__USE_KEY:
				setUseKey(USE_KEY_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__PRIVILEGE_GRANTED:
				setPrivilegeGranted(PRIVILEGE_GRANTED_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__ACTIVITIES:
				getActivities().clear();
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__ACTIVITY_QUALIFIERS:
				getActivityQualifiers().clear();
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__QUALIFIER_FORMATS:
				getQualifierFormats().clear();
				return;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__REPRESENTS_AUTHORIZATION_RIGHTS:
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
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__SUBJECT:
				return subject != null;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__TARGET:
				return target != null;
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__USE_KEY:
				return USE_KEY_EDEFAULT == null ? useKey != null : !USE_KEY_EDEFAULT.equals(useKey);
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__PRIVILEGE_GRANTED:
				return PRIVILEGE_GRANTED_EDEFAULT == null ? privilegeGranted != null : !PRIVILEGE_GRANTED_EDEFAULT.equals(privilegeGranted);
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__ACTIVITY_QUALIFIERS:
				return activityQualifiers != null && !activityQualifiers.isEmpty();
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__QUALIFIER_FORMATS:
				return qualifierFormats != null && !qualifierFormats.isEmpty();
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE__REPRESENTS_AUTHORIZATION_RIGHTS:
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
		result.append(" (UseKey: ");
		result.append(useKey);
		result.append(", PrivilegeGranted: ");
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

} //CIM_AssociatedPrivilegeImpl
