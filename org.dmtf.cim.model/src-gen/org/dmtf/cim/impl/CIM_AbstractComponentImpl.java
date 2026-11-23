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

import org.dmtf.cim.CIM_AbstractComponent;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Abstract Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractComponentImpl#getGroupComponent <em>Group Component</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractComponentImpl#getPartComponent <em>Part Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_AbstractComponentImpl extends MinimalEObjectImpl.Container implements CIM_AbstractComponent {
	/**
	 * The cached value of the '{@link #getGroupComponent() <em>Group Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupComponent()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement groupComponent;

	/**
	 * The cached value of the '{@link #getPartComponent() <em>Part Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartComponent()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement partComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AbstractComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AbstractComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getGroupComponent() {
		if (groupComponent != null && groupComponent.eIsProxy()) {
			InternalEObject oldGroupComponent = (InternalEObject)groupComponent;
			groupComponent = (CIM_ManagedElement)eResolveProxy(oldGroupComponent);
			if (groupComponent != oldGroupComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ABSTRACT_COMPONENT__GROUP_COMPONENT, oldGroupComponent, groupComponent));
			}
		}
		return groupComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetGroupComponent() {
		return groupComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupComponent(CIM_ManagedElement newGroupComponent) {
		CIM_ManagedElement oldGroupComponent = groupComponent;
		groupComponent = newGroupComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_COMPONENT__GROUP_COMPONENT, oldGroupComponent, groupComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getPartComponent() {
		if (partComponent != null && partComponent.eIsProxy()) {
			InternalEObject oldPartComponent = (InternalEObject)partComponent;
			partComponent = (CIM_ManagedElement)eResolveProxy(oldPartComponent);
			if (partComponent != oldPartComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_ABSTRACT_COMPONENT__PART_COMPONENT, oldPartComponent, partComponent));
			}
		}
		return partComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetPartComponent() {
		return partComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartComponent(CIM_ManagedElement newPartComponent) {
		CIM_ManagedElement oldPartComponent = partComponent;
		partComponent = newPartComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_COMPONENT__PART_COMPONENT, oldPartComponent, partComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ABSTRACT_COMPONENT__GROUP_COMPONENT:
				if (resolve) return getGroupComponent();
				return basicGetGroupComponent();
			case CimPackage.CIM_ABSTRACT_COMPONENT__PART_COMPONENT:
				if (resolve) return getPartComponent();
				return basicGetPartComponent();
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
			case CimPackage.CIM_ABSTRACT_COMPONENT__GROUP_COMPONENT:
				setGroupComponent((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_COMPONENT__PART_COMPONENT:
				setPartComponent((CIM_ManagedElement)newValue);
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
			case CimPackage.CIM_ABSTRACT_COMPONENT__GROUP_COMPONENT:
				setGroupComponent((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_ABSTRACT_COMPONENT__PART_COMPONENT:
				setPartComponent((CIM_ManagedElement)null);
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
			case CimPackage.CIM_ABSTRACT_COMPONENT__GROUP_COMPONENT:
				return groupComponent != null;
			case CimPackage.CIM_ABSTRACT_COMPONENT__PART_COMPONENT:
				return partComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_AbstractComponentImpl
