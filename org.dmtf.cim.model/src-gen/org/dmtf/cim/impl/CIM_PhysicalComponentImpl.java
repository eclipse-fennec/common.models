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

import org.dmtf.cim.CIM_PhysicalComponent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComponentImpl#getRemovalConditions <em>Removal Conditions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComponentImpl#getRemovable <em>Removable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComponentImpl#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComponentImpl#getHotSwappable <em>Hot Swappable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalComponentImpl extends CIM_PhysicalElementImpl implements CIM_PhysicalComponent {
	/**
	 * The default value of the '{@link #getRemovalConditions() <em>Removal Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalConditions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMOVAL_CONDITIONS_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getRemovalConditions() <em>Removal Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalConditions()
	 * @generated
	 * @ordered
	 */
	protected Integer removalConditions = REMOVAL_CONDITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemovable() <em>Removable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REMOVABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemovable() <em>Removable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovable()
	 * @generated
	 * @ordered
	 */
	protected Boolean removable = REMOVABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplaceable() <em>Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaceable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REPLACEABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplaceable() <em>Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaceable()
	 * @generated
	 * @ordered
	 */
	protected Boolean replaceable = REPLACEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHotSwappable() <em>Hot Swappable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotSwappable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HOT_SWAPPABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHotSwappable() <em>Hot Swappable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotSwappable()
	 * @generated
	 * @ordered
	 */
	protected Boolean hotSwappable = HOT_SWAPPABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemovalConditions() {
		return removalConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemovalConditions(Integer newRemovalConditions) {
		Integer oldRemovalConditions = removalConditions;
		removalConditions = newRemovalConditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPONENT__REMOVAL_CONDITIONS, oldRemovalConditions, removalConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRemovable() {
		return removable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemovable(Boolean newRemovable) {
		Boolean oldRemovable = removable;
		removable = newRemovable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPONENT__REMOVABLE, oldRemovable, removable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReplaceable() {
		return replaceable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplaceable(Boolean newReplaceable) {
		Boolean oldReplaceable = replaceable;
		replaceable = newReplaceable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPONENT__REPLACEABLE, oldReplaceable, replaceable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHotSwappable() {
		return hotSwappable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHotSwappable(Boolean newHotSwappable) {
		Boolean oldHotSwappable = hotSwappable;
		hotSwappable = newHotSwappable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPONENT__HOT_SWAPPABLE, oldHotSwappable, hotSwappable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_COMPONENT__REMOVAL_CONDITIONS:
				return getRemovalConditions();
			case CimPackage.CIM_PHYSICAL_COMPONENT__REMOVABLE:
				return getRemovable();
			case CimPackage.CIM_PHYSICAL_COMPONENT__REPLACEABLE:
				return getReplaceable();
			case CimPackage.CIM_PHYSICAL_COMPONENT__HOT_SWAPPABLE:
				return getHotSwappable();
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
			case CimPackage.CIM_PHYSICAL_COMPONENT__REMOVAL_CONDITIONS:
				setRemovalConditions((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPONENT__REMOVABLE:
				setRemovable((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPONENT__REPLACEABLE:
				setReplaceable((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPONENT__HOT_SWAPPABLE:
				setHotSwappable((Boolean)newValue);
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
			case CimPackage.CIM_PHYSICAL_COMPONENT__REMOVAL_CONDITIONS:
				setRemovalConditions(REMOVAL_CONDITIONS_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPONENT__REMOVABLE:
				setRemovable(REMOVABLE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPONENT__REPLACEABLE:
				setReplaceable(REPLACEABLE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPONENT__HOT_SWAPPABLE:
				setHotSwappable(HOT_SWAPPABLE_EDEFAULT);
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
			case CimPackage.CIM_PHYSICAL_COMPONENT__REMOVAL_CONDITIONS:
				return REMOVAL_CONDITIONS_EDEFAULT == null ? removalConditions != null : !REMOVAL_CONDITIONS_EDEFAULT.equals(removalConditions);
			case CimPackage.CIM_PHYSICAL_COMPONENT__REMOVABLE:
				return REMOVABLE_EDEFAULT == null ? removable != null : !REMOVABLE_EDEFAULT.equals(removable);
			case CimPackage.CIM_PHYSICAL_COMPONENT__REPLACEABLE:
				return REPLACEABLE_EDEFAULT == null ? replaceable != null : !REPLACEABLE_EDEFAULT.equals(replaceable);
			case CimPackage.CIM_PHYSICAL_COMPONENT__HOT_SWAPPABLE:
				return HOT_SWAPPABLE_EDEFAULT == null ? hotSwappable != null : !HOT_SWAPPABLE_EDEFAULT.equals(hotSwappable);
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
		result.append(" (RemovalConditions: ");
		result.append(removalConditions);
		result.append(", Removable: ");
		result.append(removable);
		result.append(", Replaceable: ");
		result.append(replaceable);
		result.append(", HotSwappable: ");
		result.append(hotSwappable);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalComponentImpl
