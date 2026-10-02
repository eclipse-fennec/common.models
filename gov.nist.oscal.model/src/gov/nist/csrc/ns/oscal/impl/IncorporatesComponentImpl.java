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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.IncorporatesComponent;
import gov.nist.csrc.ns.oscal.OSCALPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incorporates Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.IncorporatesComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.IncorporatesComponentImpl#getComponentUuid <em>Component Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncorporatesComponentImpl extends MinimalEObjectImpl.Container implements IncorporatesComponent {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentUuid() <em>Component Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentUuid() <em>Component Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentUuid()
	 * @generated
	 * @ordered
	 */
	protected String componentUuid = COMPONENT_UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncorporatesComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getIncorporatesComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INCORPORATES_COMPONENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentUuid() {
		return componentUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentUuid(String newComponentUuid) {
		String oldComponentUuid = componentUuid;
		componentUuid = newComponentUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INCORPORATES_COMPONENT__COMPONENT_UUID, oldComponentUuid, componentUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.INCORPORATES_COMPONENT__DESCRIPTION:
				return getDescription();
			case OSCALPackage.INCORPORATES_COMPONENT__COMPONENT_UUID:
				return getComponentUuid();
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
			case OSCALPackage.INCORPORATES_COMPONENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.INCORPORATES_COMPONENT__COMPONENT_UUID:
				setComponentUuid((String)newValue);
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
			case OSCALPackage.INCORPORATES_COMPONENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.INCORPORATES_COMPONENT__COMPONENT_UUID:
				setComponentUuid(COMPONENT_UUID_EDEFAULT);
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
			case OSCALPackage.INCORPORATES_COMPONENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.INCORPORATES_COMPONENT__COMPONENT_UUID:
				return COMPONENT_UUID_EDEFAULT == null ? componentUuid != null : !COMPONENT_UUID_EDEFAULT.equals(componentUuid);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", componentUuid: ");
		result.append(componentUuid);
		result.append(')');
		return result.toString();
	}

} //IncorporatesComponentImpl
