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

import org.dmtf.cim.CIM_Configuration;
import org.dmtf.cim.CIM_ConfigurationComponent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Configuration Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfigurationComponentImpl#getConfigGroup <em>Config Group</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfigurationComponentImpl#getConfigComponent <em>Config Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ConfigurationComponentImpl extends MinimalEObjectImpl.Container implements CIM_ConfigurationComponent {
	/**
	 * The cached value of the '{@link #getConfigGroup() <em>Config Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigGroup()
	 * @generated
	 * @ordered
	 */
	protected CIM_Configuration configGroup;

	/**
	 * The cached value of the '{@link #getConfigComponent() <em>Config Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigComponent()
	 * @generated
	 * @ordered
	 */
	protected CIM_Configuration configComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ConfigurationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ConfigurationComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Configuration getConfigGroup() {
		if (configGroup != null && configGroup.eIsProxy()) {
			InternalEObject oldConfigGroup = (InternalEObject)configGroup;
			configGroup = (CIM_Configuration)eResolveProxy(oldConfigGroup);
			if (configGroup != oldConfigGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_GROUP, oldConfigGroup, configGroup));
			}
		}
		return configGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Configuration basicGetConfigGroup() {
		return configGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigGroup(CIM_Configuration newConfigGroup) {
		CIM_Configuration oldConfigGroup = configGroup;
		configGroup = newConfigGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_GROUP, oldConfigGroup, configGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Configuration getConfigComponent() {
		if (configComponent != null && configComponent.eIsProxy()) {
			InternalEObject oldConfigComponent = (InternalEObject)configComponent;
			configComponent = (CIM_Configuration)eResolveProxy(oldConfigComponent);
			if (configComponent != oldConfigComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_COMPONENT, oldConfigComponent, configComponent));
			}
		}
		return configComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Configuration basicGetConfigComponent() {
		return configComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigComponent(CIM_Configuration newConfigComponent) {
		CIM_Configuration oldConfigComponent = configComponent;
		configComponent = newConfigComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_COMPONENT, oldConfigComponent, configComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_GROUP:
				if (resolve) return getConfigGroup();
				return basicGetConfigGroup();
			case CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_COMPONENT:
				if (resolve) return getConfigComponent();
				return basicGetConfigComponent();
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
			case CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_GROUP:
				setConfigGroup((CIM_Configuration)newValue);
				return;
			case CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_COMPONENT:
				setConfigComponent((CIM_Configuration)newValue);
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
			case CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_GROUP:
				setConfigGroup((CIM_Configuration)null);
				return;
			case CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_COMPONENT:
				setConfigComponent((CIM_Configuration)null);
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
			case CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_GROUP:
				return configGroup != null;
			case CimPackage.CIM_CONFIGURATION_COMPONENT__CONFIG_COMPONENT:
				return configComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_ConfigurationComponentImpl
