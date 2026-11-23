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

import org.dmtf.cim.CIM_DatabaseSegmentSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Database Segment Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseSegmentSettingDataImpl#getInitialExtentSize <em>Initial Extent Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseSegmentSettingDataImpl#getMinimumExtents <em>Minimum Extents</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseSegmentSettingDataImpl#getMaximumExtents <em>Maximum Extents</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseSegmentSettingDataImpl#getNextExtentSize <em>Next Extent Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseSegmentSettingDataImpl#getPercentIncrease <em>Percent Increase</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseSegmentSettingDataImpl#getNumberOfFreeLists <em>Number Of Free Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DatabaseSegmentSettingDataImpl extends CIM_ScopedSettingDataImpl implements CIM_DatabaseSegmentSettingData {
	/**
	 * The default value of the '{@link #getInitialExtentSize() <em>Initial Extent Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialExtentSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long INITIAL_EXTENT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialExtentSize() <em>Initial Extent Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialExtentSize()
	 * @generated
	 * @ordered
	 */
	protected Long initialExtentSize = INITIAL_EXTENT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumExtents() <em>Minimum Extents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumExtents()
	 * @generated
	 * @ordered
	 */
	protected static final Long MINIMUM_EXTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumExtents() <em>Minimum Extents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumExtents()
	 * @generated
	 * @ordered
	 */
	protected Long minimumExtents = MINIMUM_EXTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumExtents() <em>Maximum Extents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumExtents()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAXIMUM_EXTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumExtents() <em>Maximum Extents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumExtents()
	 * @generated
	 * @ordered
	 */
	protected Long maximumExtents = MAXIMUM_EXTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextExtentSize() <em>Next Extent Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextExtentSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long NEXT_EXTENT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextExtentSize() <em>Next Extent Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextExtentSize()
	 * @generated
	 * @ordered
	 */
	protected Long nextExtentSize = NEXT_EXTENT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentIncrease() <em>Percent Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentIncrease()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCENT_INCREASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentIncrease() <em>Percent Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentIncrease()
	 * @generated
	 * @ordered
	 */
	protected Integer percentIncrease = PERCENT_INCREASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfFreeLists() <em>Number Of Free Lists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFreeLists()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_FREE_LISTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfFreeLists() <em>Number Of Free Lists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFreeLists()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfFreeLists = NUMBER_OF_FREE_LISTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DatabaseSegmentSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DatabaseSegmentSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInitialExtentSize() {
		return initialExtentSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialExtentSize(Long newInitialExtentSize) {
		Long oldInitialExtentSize = initialExtentSize;
		initialExtentSize = newInitialExtentSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__INITIAL_EXTENT_SIZE, oldInitialExtentSize, initialExtentSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinimumExtents() {
		return minimumExtents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumExtents(Long newMinimumExtents) {
		Long oldMinimumExtents = minimumExtents;
		minimumExtents = newMinimumExtents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__MINIMUM_EXTENTS, oldMinimumExtents, minimumExtents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaximumExtents() {
		return maximumExtents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumExtents(Long newMaximumExtents) {
		Long oldMaximumExtents = maximumExtents;
		maximumExtents = newMaximumExtents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__MAXIMUM_EXTENTS, oldMaximumExtents, maximumExtents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNextExtentSize() {
		return nextExtentSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextExtentSize(Long newNextExtentSize) {
		Long oldNextExtentSize = nextExtentSize;
		nextExtentSize = newNextExtentSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__NEXT_EXTENT_SIZE, oldNextExtentSize, nextExtentSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPercentIncrease() {
		return percentIncrease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentIncrease(Integer newPercentIncrease) {
		Integer oldPercentIncrease = percentIncrease;
		percentIncrease = newPercentIncrease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__PERCENT_INCREASE, oldPercentIncrease, percentIncrease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfFreeLists() {
		return numberOfFreeLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfFreeLists(Long newNumberOfFreeLists) {
		Long oldNumberOfFreeLists = numberOfFreeLists;
		numberOfFreeLists = newNumberOfFreeLists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__NUMBER_OF_FREE_LISTS, oldNumberOfFreeLists, numberOfFreeLists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__INITIAL_EXTENT_SIZE:
				return getInitialExtentSize();
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__MINIMUM_EXTENTS:
				return getMinimumExtents();
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__MAXIMUM_EXTENTS:
				return getMaximumExtents();
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__NEXT_EXTENT_SIZE:
				return getNextExtentSize();
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__PERCENT_INCREASE:
				return getPercentIncrease();
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__NUMBER_OF_FREE_LISTS:
				return getNumberOfFreeLists();
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
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__INITIAL_EXTENT_SIZE:
				setInitialExtentSize((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__MINIMUM_EXTENTS:
				setMinimumExtents((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__MAXIMUM_EXTENTS:
				setMaximumExtents((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__NEXT_EXTENT_SIZE:
				setNextExtentSize((Long)newValue);
				return;
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__PERCENT_INCREASE:
				setPercentIncrease((Integer)newValue);
				return;
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__NUMBER_OF_FREE_LISTS:
				setNumberOfFreeLists((Long)newValue);
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
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__INITIAL_EXTENT_SIZE:
				setInitialExtentSize(INITIAL_EXTENT_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__MINIMUM_EXTENTS:
				setMinimumExtents(MINIMUM_EXTENTS_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__MAXIMUM_EXTENTS:
				setMaximumExtents(MAXIMUM_EXTENTS_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__NEXT_EXTENT_SIZE:
				setNextExtentSize(NEXT_EXTENT_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__PERCENT_INCREASE:
				setPercentIncrease(PERCENT_INCREASE_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__NUMBER_OF_FREE_LISTS:
				setNumberOfFreeLists(NUMBER_OF_FREE_LISTS_EDEFAULT);
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
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__INITIAL_EXTENT_SIZE:
				return INITIAL_EXTENT_SIZE_EDEFAULT == null ? initialExtentSize != null : !INITIAL_EXTENT_SIZE_EDEFAULT.equals(initialExtentSize);
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__MINIMUM_EXTENTS:
				return MINIMUM_EXTENTS_EDEFAULT == null ? minimumExtents != null : !MINIMUM_EXTENTS_EDEFAULT.equals(minimumExtents);
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__MAXIMUM_EXTENTS:
				return MAXIMUM_EXTENTS_EDEFAULT == null ? maximumExtents != null : !MAXIMUM_EXTENTS_EDEFAULT.equals(maximumExtents);
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__NEXT_EXTENT_SIZE:
				return NEXT_EXTENT_SIZE_EDEFAULT == null ? nextExtentSize != null : !NEXT_EXTENT_SIZE_EDEFAULT.equals(nextExtentSize);
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__PERCENT_INCREASE:
				return PERCENT_INCREASE_EDEFAULT == null ? percentIncrease != null : !PERCENT_INCREASE_EDEFAULT.equals(percentIncrease);
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA__NUMBER_OF_FREE_LISTS:
				return NUMBER_OF_FREE_LISTS_EDEFAULT == null ? numberOfFreeLists != null : !NUMBER_OF_FREE_LISTS_EDEFAULT.equals(numberOfFreeLists);
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
		result.append(" (InitialExtentSize: ");
		result.append(initialExtentSize);
		result.append(", MinimumExtents: ");
		result.append(minimumExtents);
		result.append(", MaximumExtents: ");
		result.append(maximumExtents);
		result.append(", NextExtentSize: ");
		result.append(nextExtentSize);
		result.append(", PercentIncrease: ");
		result.append(percentIncrease);
		result.append(", NumberOfFreeLists: ");
		result.append(numberOfFreeLists);
		result.append(')');
		return result.toString();
	}

} //CIM_DatabaseSegmentSettingDataImpl
