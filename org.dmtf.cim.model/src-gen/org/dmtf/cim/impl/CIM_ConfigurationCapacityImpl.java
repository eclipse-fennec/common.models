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

import org.dmtf.cim.CIM_ConfigurationCapacity;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Configuration Capacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfigurationCapacityImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfigurationCapacityImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfigurationCapacityImpl#getMinimumCapacity <em>Minimum Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfigurationCapacityImpl#getMaximumCapacity <em>Maximum Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfigurationCapacityImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ConfigurationCapacityImpl#getVendorCompatibilityStrings <em>Vendor Compatibility Strings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ConfigurationCapacityImpl extends CIM_PhysicalCapacityImpl implements CIM_ConfigurationCapacity {
	/**
	 * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OBJECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected Integer objectType = OBJECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTypeDescription = OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumCapacity() <em>Minimum Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long MINIMUM_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumCapacity() <em>Minimum Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long minimumCapacity = MINIMUM_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumCapacity() <em>Maximum Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAXIMUM_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumCapacity() <em>Maximum Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long maximumCapacity = MAXIMUM_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final Long INCREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected Long increment = INCREMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVendorCompatibilityStrings() <em>Vendor Compatibility Strings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorCompatibilityStrings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vendorCompatibilityStrings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ConfigurationCapacityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ConfigurationCapacity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getObjectType() {
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectType(Integer newObjectType) {
		Integer oldObjectType = objectType;
		objectType = newObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONFIGURATION_CAPACITY__OBJECT_TYPE, oldObjectType, objectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTypeDescription() {
		return otherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTypeDescription(String newOtherTypeDescription) {
		String oldOtherTypeDescription = otherTypeDescription;
		otherTypeDescription = newOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONFIGURATION_CAPACITY__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinimumCapacity() {
		return minimumCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumCapacity(Long newMinimumCapacity) {
		Long oldMinimumCapacity = minimumCapacity;
		minimumCapacity = newMinimumCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONFIGURATION_CAPACITY__MINIMUM_CAPACITY, oldMinimumCapacity, minimumCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaximumCapacity() {
		return maximumCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumCapacity(Long newMaximumCapacity) {
		Long oldMaximumCapacity = maximumCapacity;
		maximumCapacity = newMaximumCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONFIGURATION_CAPACITY__MAXIMUM_CAPACITY, oldMaximumCapacity, maximumCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIncrement() {
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrement(Long newIncrement) {
		Long oldIncrement = increment;
		increment = newIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONFIGURATION_CAPACITY__INCREMENT, oldIncrement, increment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVendorCompatibilityStrings() {
		if (vendorCompatibilityStrings == null) {
			vendorCompatibilityStrings = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_CONFIGURATION_CAPACITY__VENDOR_COMPATIBILITY_STRINGS);
		}
		return vendorCompatibilityStrings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CONFIGURATION_CAPACITY__OBJECT_TYPE:
				return getObjectType();
			case CimPackage.CIM_CONFIGURATION_CAPACITY__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
			case CimPackage.CIM_CONFIGURATION_CAPACITY__MINIMUM_CAPACITY:
				return getMinimumCapacity();
			case CimPackage.CIM_CONFIGURATION_CAPACITY__MAXIMUM_CAPACITY:
				return getMaximumCapacity();
			case CimPackage.CIM_CONFIGURATION_CAPACITY__INCREMENT:
				return getIncrement();
			case CimPackage.CIM_CONFIGURATION_CAPACITY__VENDOR_COMPATIBILITY_STRINGS:
				return getVendorCompatibilityStrings();
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
			case CimPackage.CIM_CONFIGURATION_CAPACITY__OBJECT_TYPE:
				setObjectType((Integer)newValue);
				return;
			case CimPackage.CIM_CONFIGURATION_CAPACITY__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_CONFIGURATION_CAPACITY__MINIMUM_CAPACITY:
				setMinimumCapacity((Long)newValue);
				return;
			case CimPackage.CIM_CONFIGURATION_CAPACITY__MAXIMUM_CAPACITY:
				setMaximumCapacity((Long)newValue);
				return;
			case CimPackage.CIM_CONFIGURATION_CAPACITY__INCREMENT:
				setIncrement((Long)newValue);
				return;
			case CimPackage.CIM_CONFIGURATION_CAPACITY__VENDOR_COMPATIBILITY_STRINGS:
				getVendorCompatibilityStrings().clear();
				getVendorCompatibilityStrings().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_CONFIGURATION_CAPACITY__OBJECT_TYPE:
				setObjectType(OBJECT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_CONFIGURATION_CAPACITY__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_CONFIGURATION_CAPACITY__MINIMUM_CAPACITY:
				setMinimumCapacity(MINIMUM_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_CONFIGURATION_CAPACITY__MAXIMUM_CAPACITY:
				setMaximumCapacity(MAXIMUM_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_CONFIGURATION_CAPACITY__INCREMENT:
				setIncrement(INCREMENT_EDEFAULT);
				return;
			case CimPackage.CIM_CONFIGURATION_CAPACITY__VENDOR_COMPATIBILITY_STRINGS:
				getVendorCompatibilityStrings().clear();
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
			case CimPackage.CIM_CONFIGURATION_CAPACITY__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case CimPackage.CIM_CONFIGURATION_CAPACITY__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
			case CimPackage.CIM_CONFIGURATION_CAPACITY__MINIMUM_CAPACITY:
				return MINIMUM_CAPACITY_EDEFAULT == null ? minimumCapacity != null : !MINIMUM_CAPACITY_EDEFAULT.equals(minimumCapacity);
			case CimPackage.CIM_CONFIGURATION_CAPACITY__MAXIMUM_CAPACITY:
				return MAXIMUM_CAPACITY_EDEFAULT == null ? maximumCapacity != null : !MAXIMUM_CAPACITY_EDEFAULT.equals(maximumCapacity);
			case CimPackage.CIM_CONFIGURATION_CAPACITY__INCREMENT:
				return INCREMENT_EDEFAULT == null ? increment != null : !INCREMENT_EDEFAULT.equals(increment);
			case CimPackage.CIM_CONFIGURATION_CAPACITY__VENDOR_COMPATIBILITY_STRINGS:
				return vendorCompatibilityStrings != null && !vendorCompatibilityStrings.isEmpty();
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
		result.append(" (ObjectType: ");
		result.append(objectType);
		result.append(", OtherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(", MinimumCapacity: ");
		result.append(minimumCapacity);
		result.append(", MaximumCapacity: ");
		result.append(maximumCapacity);
		result.append(", Increment: ");
		result.append(increment);
		result.append(", VendorCompatibilityStrings: ");
		result.append(vendorCompatibilityStrings);
		result.append(')');
		return result.toString();
	}

} //CIM_ConfigurationCapacityImpl
