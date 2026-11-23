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

import org.dmtf.cim.CIM_AuthorizedPrivilege;
import org.dmtf.cim.CIM_AuthorizedSubject;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Authorized Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AuthorizedSubjectImpl#getPrivilege <em>Privilege</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AuthorizedSubjectImpl#getPrivilegedElement <em>Privileged Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AuthorizedSubjectImpl extends MinimalEObjectImpl.Container implements CIM_AuthorizedSubject {
	/**
	 * The cached value of the '{@link #getPrivilege() <em>Privilege</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilege()
	 * @generated
	 * @ordered
	 */
	protected CIM_AuthorizedPrivilege privilege;

	/**
	 * The cached value of the '{@link #getPrivilegedElement() <em>Privileged Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegedElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement privilegedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AuthorizedSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AuthorizedSubject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthorizedPrivilege getPrivilege() {
		if (privilege != null && privilege.eIsProxy()) {
			InternalEObject oldPrivilege = (InternalEObject)privilege;
			privilege = (CIM_AuthorizedPrivilege)eResolveProxy(oldPrivilege);
			if (privilege != oldPrivilege) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGE, oldPrivilege, privilege));
			}
		}
		return privilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_AuthorizedPrivilege basicGetPrivilege() {
		return privilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivilege(CIM_AuthorizedPrivilege newPrivilege) {
		CIM_AuthorizedPrivilege oldPrivilege = privilege;
		privilege = newPrivilege;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGE, oldPrivilege, privilege));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getPrivilegedElement() {
		if (privilegedElement != null && privilegedElement.eIsProxy()) {
			InternalEObject oldPrivilegedElement = (InternalEObject)privilegedElement;
			privilegedElement = (CIM_ManagedElement)eResolveProxy(oldPrivilegedElement);
			if (privilegedElement != oldPrivilegedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGED_ELEMENT, oldPrivilegedElement, privilegedElement));
			}
		}
		return privilegedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetPrivilegedElement() {
		return privilegedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivilegedElement(CIM_ManagedElement newPrivilegedElement) {
		CIM_ManagedElement oldPrivilegedElement = privilegedElement;
		privilegedElement = newPrivilegedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGED_ELEMENT, oldPrivilegedElement, privilegedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGE:
				if (resolve) return getPrivilege();
				return basicGetPrivilege();
			case CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGED_ELEMENT:
				if (resolve) return getPrivilegedElement();
				return basicGetPrivilegedElement();
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
			case CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGE:
				setPrivilege((CIM_AuthorizedPrivilege)newValue);
				return;
			case CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGED_ELEMENT:
				setPrivilegedElement((CIM_ManagedElement)newValue);
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
			case CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGE:
				setPrivilege((CIM_AuthorizedPrivilege)null);
				return;
			case CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGED_ELEMENT:
				setPrivilegedElement((CIM_ManagedElement)null);
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
			case CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGE:
				return privilege != null;
			case CimPackage.CIM_AUTHORIZED_SUBJECT__PRIVILEGED_ELEMENT:
				return privilegedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_AuthorizedSubjectImpl
