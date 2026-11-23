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

import org.dmtf.cim.CIM_CompositeExtentBasedOn;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Composite Extent Based On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompositeExtentBasedOnImpl#getLBAsMappedByDecrementing <em>LB As Mapped By Decrementing</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompositeExtentBasedOnImpl#getLBAMappingIncludesCheckData <em>LBA Mapping Includes Check Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompositeExtentBasedOnImpl#getNumberOfBlocks <em>Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompositeExtentBasedOnImpl#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompositeExtentBasedOnImpl#getUserDataStripeDepth <em>User Data Stripe Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompositeExtentBasedOnImpl#getUnitsBeforeCheckDataInterleave <em>Units Before Check Data Interleave</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompositeExtentBasedOnImpl#getUnitsOfCheckData <em>Units Of Check Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompositeExtentBasedOnImpl#getUnitsOfUserData <em>Units Of User Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CompositeExtentBasedOnImpl extends CIM_BasedOnImpl implements CIM_CompositeExtentBasedOn {
	/**
	 * The default value of the '{@link #getLBAsMappedByDecrementing() <em>LB As Mapped By Decrementing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAsMappedByDecrementing()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LB_AS_MAPPED_BY_DECREMENTING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLBAsMappedByDecrementing() <em>LB As Mapped By Decrementing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAsMappedByDecrementing()
	 * @generated
	 * @ordered
	 */
	protected Boolean lbAsMappedByDecrementing = LB_AS_MAPPED_BY_DECREMENTING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLBAMappingIncludesCheckData() <em>LBA Mapping Includes Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAMappingIncludesCheckData()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LBA_MAPPING_INCLUDES_CHECK_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLBAMappingIncludesCheckData() <em>LBA Mapping Includes Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLBAMappingIncludesCheckData()
	 * @generated
	 * @ordered
	 */
	protected Boolean lbaMappingIncludesCheckData = LBA_MAPPING_INCLUDES_CHECK_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfBlocks() <em>Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfBlocks() <em>Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfBlocks = NUMBER_OF_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockSize() <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockSize() <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long blockSize = BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDataStripeDepth() <em>User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Long USER_DATA_STRIPE_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDataStripeDepth() <em>User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepth()
	 * @generated
	 * @ordered
	 */
	protected Long userDataStripeDepth = USER_DATA_STRIPE_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitsBeforeCheckDataInterleave() <em>Units Before Check Data Interleave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsBeforeCheckDataInterleave()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNITS_BEFORE_CHECK_DATA_INTERLEAVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitsBeforeCheckDataInterleave() <em>Units Before Check Data Interleave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsBeforeCheckDataInterleave()
	 * @generated
	 * @ordered
	 */
	protected Long unitsBeforeCheckDataInterleave = UNITS_BEFORE_CHECK_DATA_INTERLEAVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitsOfCheckData() <em>Units Of Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsOfCheckData()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNITS_OF_CHECK_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitsOfCheckData() <em>Units Of Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsOfCheckData()
	 * @generated
	 * @ordered
	 */
	protected Long unitsOfCheckData = UNITS_OF_CHECK_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitsOfUserData() <em>Units Of User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsOfUserData()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNITS_OF_USER_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitsOfUserData() <em>Units Of User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsOfUserData()
	 * @generated
	 * @ordered
	 */
	protected Long unitsOfUserData = UNITS_OF_USER_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CompositeExtentBasedOnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CompositeExtentBasedOn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLBAsMappedByDecrementing() {
		return lbAsMappedByDecrementing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLBAsMappedByDecrementing(Boolean newLBAsMappedByDecrementing) {
		Boolean oldLBAsMappedByDecrementing = lbAsMappedByDecrementing;
		lbAsMappedByDecrementing = newLBAsMappedByDecrementing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__LB_AS_MAPPED_BY_DECREMENTING, oldLBAsMappedByDecrementing, lbAsMappedByDecrementing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLBAMappingIncludesCheckData() {
		return lbaMappingIncludesCheckData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLBAMappingIncludesCheckData(Boolean newLBAMappingIncludesCheckData) {
		Boolean oldLBAMappingIncludesCheckData = lbaMappingIncludesCheckData;
		lbaMappingIncludesCheckData = newLBAMappingIncludesCheckData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__LBA_MAPPING_INCLUDES_CHECK_DATA, oldLBAMappingIncludesCheckData, lbaMappingIncludesCheckData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfBlocks() {
		return numberOfBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfBlocks(Long newNumberOfBlocks) {
		Long oldNumberOfBlocks = numberOfBlocks;
		numberOfBlocks = newNumberOfBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__NUMBER_OF_BLOCKS, oldNumberOfBlocks, numberOfBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBlockSize() {
		return blockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockSize(Long newBlockSize) {
		Long oldBlockSize = blockSize;
		blockSize = newBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__BLOCK_SIZE, oldBlockSize, blockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUserDataStripeDepth() {
		return userDataStripeDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDataStripeDepth(Long newUserDataStripeDepth) {
		Long oldUserDataStripeDepth = userDataStripeDepth;
		userDataStripeDepth = newUserDataStripeDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__USER_DATA_STRIPE_DEPTH, oldUserDataStripeDepth, userDataStripeDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnitsBeforeCheckDataInterleave() {
		return unitsBeforeCheckDataInterleave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsBeforeCheckDataInterleave(Long newUnitsBeforeCheckDataInterleave) {
		Long oldUnitsBeforeCheckDataInterleave = unitsBeforeCheckDataInterleave;
		unitsBeforeCheckDataInterleave = newUnitsBeforeCheckDataInterleave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_BEFORE_CHECK_DATA_INTERLEAVE, oldUnitsBeforeCheckDataInterleave, unitsBeforeCheckDataInterleave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnitsOfCheckData() {
		return unitsOfCheckData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsOfCheckData(Long newUnitsOfCheckData) {
		Long oldUnitsOfCheckData = unitsOfCheckData;
		unitsOfCheckData = newUnitsOfCheckData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_OF_CHECK_DATA, oldUnitsOfCheckData, unitsOfCheckData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnitsOfUserData() {
		return unitsOfUserData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsOfUserData(Long newUnitsOfUserData) {
		Long oldUnitsOfUserData = unitsOfUserData;
		unitsOfUserData = newUnitsOfUserData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_OF_USER_DATA, oldUnitsOfUserData, unitsOfUserData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__LB_AS_MAPPED_BY_DECREMENTING:
				return getLBAsMappedByDecrementing();
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__LBA_MAPPING_INCLUDES_CHECK_DATA:
				return getLBAMappingIncludesCheckData();
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__NUMBER_OF_BLOCKS:
				return getNumberOfBlocks();
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__BLOCK_SIZE:
				return getBlockSize();
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__USER_DATA_STRIPE_DEPTH:
				return getUserDataStripeDepth();
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_BEFORE_CHECK_DATA_INTERLEAVE:
				return getUnitsBeforeCheckDataInterleave();
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_OF_CHECK_DATA:
				return getUnitsOfCheckData();
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_OF_USER_DATA:
				return getUnitsOfUserData();
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
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__LB_AS_MAPPED_BY_DECREMENTING:
				setLBAsMappedByDecrementing((Boolean)newValue);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__LBA_MAPPING_INCLUDES_CHECK_DATA:
				setLBAMappingIncludesCheckData((Boolean)newValue);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__NUMBER_OF_BLOCKS:
				setNumberOfBlocks((Long)newValue);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__BLOCK_SIZE:
				setBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__USER_DATA_STRIPE_DEPTH:
				setUserDataStripeDepth((Long)newValue);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_BEFORE_CHECK_DATA_INTERLEAVE:
				setUnitsBeforeCheckDataInterleave((Long)newValue);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_OF_CHECK_DATA:
				setUnitsOfCheckData((Long)newValue);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_OF_USER_DATA:
				setUnitsOfUserData((Long)newValue);
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
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__LB_AS_MAPPED_BY_DECREMENTING:
				setLBAsMappedByDecrementing(LB_AS_MAPPED_BY_DECREMENTING_EDEFAULT);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__LBA_MAPPING_INCLUDES_CHECK_DATA:
				setLBAMappingIncludesCheckData(LBA_MAPPING_INCLUDES_CHECK_DATA_EDEFAULT);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__NUMBER_OF_BLOCKS:
				setNumberOfBlocks(NUMBER_OF_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__BLOCK_SIZE:
				setBlockSize(BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__USER_DATA_STRIPE_DEPTH:
				setUserDataStripeDepth(USER_DATA_STRIPE_DEPTH_EDEFAULT);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_BEFORE_CHECK_DATA_INTERLEAVE:
				setUnitsBeforeCheckDataInterleave(UNITS_BEFORE_CHECK_DATA_INTERLEAVE_EDEFAULT);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_OF_CHECK_DATA:
				setUnitsOfCheckData(UNITS_OF_CHECK_DATA_EDEFAULT);
				return;
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_OF_USER_DATA:
				setUnitsOfUserData(UNITS_OF_USER_DATA_EDEFAULT);
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
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__LB_AS_MAPPED_BY_DECREMENTING:
				return LB_AS_MAPPED_BY_DECREMENTING_EDEFAULT == null ? lbAsMappedByDecrementing != null : !LB_AS_MAPPED_BY_DECREMENTING_EDEFAULT.equals(lbAsMappedByDecrementing);
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__LBA_MAPPING_INCLUDES_CHECK_DATA:
				return LBA_MAPPING_INCLUDES_CHECK_DATA_EDEFAULT == null ? lbaMappingIncludesCheckData != null : !LBA_MAPPING_INCLUDES_CHECK_DATA_EDEFAULT.equals(lbaMappingIncludesCheckData);
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__NUMBER_OF_BLOCKS:
				return NUMBER_OF_BLOCKS_EDEFAULT == null ? numberOfBlocks != null : !NUMBER_OF_BLOCKS_EDEFAULT.equals(numberOfBlocks);
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__BLOCK_SIZE:
				return BLOCK_SIZE_EDEFAULT == null ? blockSize != null : !BLOCK_SIZE_EDEFAULT.equals(blockSize);
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__USER_DATA_STRIPE_DEPTH:
				return USER_DATA_STRIPE_DEPTH_EDEFAULT == null ? userDataStripeDepth != null : !USER_DATA_STRIPE_DEPTH_EDEFAULT.equals(userDataStripeDepth);
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_BEFORE_CHECK_DATA_INTERLEAVE:
				return UNITS_BEFORE_CHECK_DATA_INTERLEAVE_EDEFAULT == null ? unitsBeforeCheckDataInterleave != null : !UNITS_BEFORE_CHECK_DATA_INTERLEAVE_EDEFAULT.equals(unitsBeforeCheckDataInterleave);
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_OF_CHECK_DATA:
				return UNITS_OF_CHECK_DATA_EDEFAULT == null ? unitsOfCheckData != null : !UNITS_OF_CHECK_DATA_EDEFAULT.equals(unitsOfCheckData);
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON__UNITS_OF_USER_DATA:
				return UNITS_OF_USER_DATA_EDEFAULT == null ? unitsOfUserData != null : !UNITS_OF_USER_DATA_EDEFAULT.equals(unitsOfUserData);
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
		result.append(" (LBAsMappedByDecrementing: ");
		result.append(lbAsMappedByDecrementing);
		result.append(", LBAMappingIncludesCheckData: ");
		result.append(lbaMappingIncludesCheckData);
		result.append(", NumberOfBlocks: ");
		result.append(numberOfBlocks);
		result.append(", BlockSize: ");
		result.append(blockSize);
		result.append(", UserDataStripeDepth: ");
		result.append(userDataStripeDepth);
		result.append(", UnitsBeforeCheckDataInterleave: ");
		result.append(unitsBeforeCheckDataInterleave);
		result.append(", UnitsOfCheckData: ");
		result.append(unitsOfCheckData);
		result.append(", UnitsOfUserData: ");
		result.append(unitsOfUserData);
		result.append(')');
		return result.toString();
	}

} //CIM_CompositeExtentBasedOnImpl
