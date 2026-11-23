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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_PhysicalElement;
import org.dmtf.cim.CIM_PhysicalPackage;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalPackageImpl#getRemovalConditions <em>Removal Conditions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalPackageImpl#getRemovable <em>Removable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalPackageImpl#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalPackageImpl#getHotSwappable <em>Hot Swappable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalPackageImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalPackageImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalPackageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalPackageImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalPackageImpl#getPackageType <em>Package Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalPackageImpl#getOtherPackageType <em>Other Package Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalPackageImpl#getVendorCompatibilityStrings <em>Vendor Compatibility Strings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalPackageImpl extends CIM_PhysicalElementImpl implements CIM_PhysicalPackage {
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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Float HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Float height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Float DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected Float depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Float WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Float WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Float weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageType() <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PACKAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageType() <em>Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageType()
	 * @generated
	 * @ordered
	 */
	protected Integer packageType = PACKAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPackageType() <em>Other Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPackageType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PACKAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPackageType() <em>Other Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPackageType()
	 * @generated
	 * @ordered
	 */
	protected String otherPackageType = OTHER_PACKAGE_TYPE_EDEFAULT;

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
	protected CIM_PhysicalPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalPackage();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_PACKAGE__REMOVAL_CONDITIONS, oldRemovalConditions, removalConditions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_PACKAGE__REMOVABLE, oldRemovable, removable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_PACKAGE__REPLACEABLE, oldReplaceable, replaceable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_PACKAGE__HOT_SWAPPABLE, oldHotSwappable, hotSwappable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(Float newHeight) {
		Float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_PACKAGE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepth(Float newDepth) {
		Float oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_PACKAGE__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(Float newWidth) {
		Float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_PACKAGE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(Float newWeight) {
		Float oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_PACKAGE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPackageType() {
		return packageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageType(Integer newPackageType) {
		Integer oldPackageType = packageType;
		packageType = newPackageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_PACKAGE__PACKAGE_TYPE, oldPackageType, packageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPackageType() {
		return otherPackageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPackageType(String newOtherPackageType) {
		String oldOtherPackageType = otherPackageType;
		otherPackageType = newOtherPackageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_PACKAGE__OTHER_PACKAGE_TYPE, oldOtherPackageType, otherPackageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVendorCompatibilityStrings() {
		if (vendorCompatibilityStrings == null) {
			vendorCompatibilityStrings = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_PACKAGE__VENDOR_COMPATIBILITY_STRINGS);
		}
		return vendorCompatibilityStrings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long IsCompatible(CIM_PhysicalElement ElementToCheck) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_PACKAGE__REMOVAL_CONDITIONS:
				return getRemovalConditions();
			case CimPackage.CIM_PHYSICAL_PACKAGE__REMOVABLE:
				return getRemovable();
			case CimPackage.CIM_PHYSICAL_PACKAGE__REPLACEABLE:
				return getReplaceable();
			case CimPackage.CIM_PHYSICAL_PACKAGE__HOT_SWAPPABLE:
				return getHotSwappable();
			case CimPackage.CIM_PHYSICAL_PACKAGE__HEIGHT:
				return getHeight();
			case CimPackage.CIM_PHYSICAL_PACKAGE__DEPTH:
				return getDepth();
			case CimPackage.CIM_PHYSICAL_PACKAGE__WIDTH:
				return getWidth();
			case CimPackage.CIM_PHYSICAL_PACKAGE__WEIGHT:
				return getWeight();
			case CimPackage.CIM_PHYSICAL_PACKAGE__PACKAGE_TYPE:
				return getPackageType();
			case CimPackage.CIM_PHYSICAL_PACKAGE__OTHER_PACKAGE_TYPE:
				return getOtherPackageType();
			case CimPackage.CIM_PHYSICAL_PACKAGE__VENDOR_COMPATIBILITY_STRINGS:
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
			case CimPackage.CIM_PHYSICAL_PACKAGE__REMOVAL_CONDITIONS:
				setRemovalConditions((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__REMOVABLE:
				setRemovable((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__REPLACEABLE:
				setReplaceable((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__HOT_SWAPPABLE:
				setHotSwappable((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__HEIGHT:
				setHeight((Float)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__DEPTH:
				setDepth((Float)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__WIDTH:
				setWidth((Float)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__WEIGHT:
				setWeight((Float)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__PACKAGE_TYPE:
				setPackageType((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__OTHER_PACKAGE_TYPE:
				setOtherPackageType((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__VENDOR_COMPATIBILITY_STRINGS:
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
			case CimPackage.CIM_PHYSICAL_PACKAGE__REMOVAL_CONDITIONS:
				setRemovalConditions(REMOVAL_CONDITIONS_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__REMOVABLE:
				setRemovable(REMOVABLE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__REPLACEABLE:
				setReplaceable(REPLACEABLE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__HOT_SWAPPABLE:
				setHotSwappable(HOT_SWAPPABLE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__PACKAGE_TYPE:
				setPackageType(PACKAGE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__OTHER_PACKAGE_TYPE:
				setOtherPackageType(OTHER_PACKAGE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_PACKAGE__VENDOR_COMPATIBILITY_STRINGS:
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
			case CimPackage.CIM_PHYSICAL_PACKAGE__REMOVAL_CONDITIONS:
				return REMOVAL_CONDITIONS_EDEFAULT == null ? removalConditions != null : !REMOVAL_CONDITIONS_EDEFAULT.equals(removalConditions);
			case CimPackage.CIM_PHYSICAL_PACKAGE__REMOVABLE:
				return REMOVABLE_EDEFAULT == null ? removable != null : !REMOVABLE_EDEFAULT.equals(removable);
			case CimPackage.CIM_PHYSICAL_PACKAGE__REPLACEABLE:
				return REPLACEABLE_EDEFAULT == null ? replaceable != null : !REPLACEABLE_EDEFAULT.equals(replaceable);
			case CimPackage.CIM_PHYSICAL_PACKAGE__HOT_SWAPPABLE:
				return HOT_SWAPPABLE_EDEFAULT == null ? hotSwappable != null : !HOT_SWAPPABLE_EDEFAULT.equals(hotSwappable);
			case CimPackage.CIM_PHYSICAL_PACKAGE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case CimPackage.CIM_PHYSICAL_PACKAGE__DEPTH:
				return DEPTH_EDEFAULT == null ? depth != null : !DEPTH_EDEFAULT.equals(depth);
			case CimPackage.CIM_PHYSICAL_PACKAGE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case CimPackage.CIM_PHYSICAL_PACKAGE__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case CimPackage.CIM_PHYSICAL_PACKAGE__PACKAGE_TYPE:
				return PACKAGE_TYPE_EDEFAULT == null ? packageType != null : !PACKAGE_TYPE_EDEFAULT.equals(packageType);
			case CimPackage.CIM_PHYSICAL_PACKAGE__OTHER_PACKAGE_TYPE:
				return OTHER_PACKAGE_TYPE_EDEFAULT == null ? otherPackageType != null : !OTHER_PACKAGE_TYPE_EDEFAULT.equals(otherPackageType);
			case CimPackage.CIM_PHYSICAL_PACKAGE__VENDOR_COMPATIBILITY_STRINGS:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_PHYSICAL_PACKAGE___IS_COMPATIBLE__CIM_PHYSICALELEMENT:
				return IsCompatible((CIM_PhysicalElement)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", Height: ");
		result.append(height);
		result.append(", Depth: ");
		result.append(depth);
		result.append(", Width: ");
		result.append(width);
		result.append(", Weight: ");
		result.append(weight);
		result.append(", PackageType: ");
		result.append(packageType);
		result.append(", OtherPackageType: ");
		result.append(otherPackageType);
		result.append(", VendorCompatibilityStrings: ");
		result.append(vendorCompatibilityStrings);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalPackageImpl
