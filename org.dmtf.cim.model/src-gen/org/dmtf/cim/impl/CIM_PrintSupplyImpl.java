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

import org.dmtf.cim.CIM_PrintSupply;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Print Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getLocalizedDescription <em>Localized Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getOtherClassification <em>Other Classification</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getSupplyUnit <em>Supply Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getOtherSupplyUnit <em>Other Supply Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getMaxCapacityBasis <em>Max Capacity Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getMaxCapacity <em>Max Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getRemainingCapacityBasis <em>Remaining Capacity Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getRemainingCapacity <em>Remaining Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getColorantRole <em>Colorant Role</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getOtherColorantRole <em>Other Colorant Role</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getColorantName <em>Colorant Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getOtherColorantName <em>Other Colorant Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintSupplyImpl#getColorantTonality <em>Colorant Tonality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PrintSupplyImpl extends CIM_PrinterElementImpl implements CIM_PrintSupply {
	/**
	 * The default value of the '{@link #getLocalizedDescription() <em>Localized Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALIZED_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalizedDescription() <em>Localized Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedDescription()
	 * @generated
	 * @ordered
	 */
	protected String localizedDescription = LOCALIZED_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected Long classification = CLASSIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherClassification() <em>Other Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherClassification() <em>Other Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherClassification()
	 * @generated
	 * @ordered
	 */
	protected String otherClassification = OTHER_CLASSIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Long TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Long type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getSupplyUnit() <em>Supply Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Long SUPPLY_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplyUnit() <em>Supply Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyUnit()
	 * @generated
	 * @ordered
	 */
	protected Long supplyUnit = SUPPLY_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSupplyUnit() <em>Other Supply Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupplyUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SUPPLY_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSupplyUnit() <em>Other Supply Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupplyUnit()
	 * @generated
	 * @ordered
	 */
	protected String otherSupplyUnit = OTHER_SUPPLY_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCapacityBasis() <em>Max Capacity Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacityBasis()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_CAPACITY_BASIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCapacityBasis() <em>Max Capacity Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacityBasis()
	 * @generated
	 * @ordered
	 */
	protected Integer maxCapacityBasis = MAX_CAPACITY_BASIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCapacity() <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCapacity() <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long maxCapacity = MAX_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingCapacityBasis() <em>Remaining Capacity Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCapacityBasis()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMAINING_CAPACITY_BASIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingCapacityBasis() <em>Remaining Capacity Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCapacityBasis()
	 * @generated
	 * @ordered
	 */
	protected Integer remainingCapacityBasis = REMAINING_CAPACITY_BASIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingCapacity() <em>Remaining Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long REMAINING_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingCapacity() <em>Remaining Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long remainingCapacity = REMAINING_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorantRole() <em>Colorant Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorantRole()
	 * @generated
	 * @ordered
	 */
	protected static final Long COLORANT_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorantRole() <em>Colorant Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorantRole()
	 * @generated
	 * @ordered
	 */
	protected Long colorantRole = COLORANT_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherColorantRole() <em>Other Colorant Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherColorantRole()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_COLORANT_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherColorantRole() <em>Other Colorant Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherColorantRole()
	 * @generated
	 * @ordered
	 */
	protected String otherColorantRole = OTHER_COLORANT_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorantName() <em>Colorant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorantName()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COLORANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorantName() <em>Colorant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorantName()
	 * @generated
	 * @ordered
	 */
	protected Integer colorantName = COLORANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherColorantName() <em>Other Colorant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherColorantName()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_COLORANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherColorantName() <em>Other Colorant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherColorantName()
	 * @generated
	 * @ordered
	 */
	protected String otherColorantName = OTHER_COLORANT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorantTonality() <em>Colorant Tonality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorantTonality()
	 * @generated
	 * @ordered
	 */
	protected static final Long COLORANT_TONALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorantTonality() <em>Colorant Tonality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorantTonality()
	 * @generated
	 * @ordered
	 */
	protected Long colorantTonality = COLORANT_TONALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrintSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PrintSupply();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalizedDescription() {
		return localizedDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalizedDescription(String newLocalizedDescription) {
		String oldLocalizedDescription = localizedDescription;
		localizedDescription = newLocalizedDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__LOCALIZED_DESCRIPTION, oldLocalizedDescription, localizedDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassification(Long newClassification) {
		Long oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__CLASSIFICATION, oldClassification, classification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherClassification() {
		return otherClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherClassification(String newOtherClassification) {
		String oldOtherClassification = otherClassification;
		otherClassification = newOtherClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__OTHER_CLASSIFICATION, oldOtherClassification, otherClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Long newType) {
		Long oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSupplyUnit() {
		return supplyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplyUnit(Long newSupplyUnit) {
		Long oldSupplyUnit = supplyUnit;
		supplyUnit = newSupplyUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__SUPPLY_UNIT, oldSupplyUnit, supplyUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSupplyUnit() {
		return otherSupplyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSupplyUnit(String newOtherSupplyUnit) {
		String oldOtherSupplyUnit = otherSupplyUnit;
		otherSupplyUnit = newOtherSupplyUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__OTHER_SUPPLY_UNIT, oldOtherSupplyUnit, otherSupplyUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxCapacityBasis() {
		return maxCapacityBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCapacityBasis(Integer newMaxCapacityBasis) {
		Integer oldMaxCapacityBasis = maxCapacityBasis;
		maxCapacityBasis = newMaxCapacityBasis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__MAX_CAPACITY_BASIS, oldMaxCapacityBasis, maxCapacityBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCapacity(Long newMaxCapacity) {
		Long oldMaxCapacity = maxCapacity;
		maxCapacity = newMaxCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__MAX_CAPACITY, oldMaxCapacity, maxCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemainingCapacityBasis() {
		return remainingCapacityBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingCapacityBasis(Integer newRemainingCapacityBasis) {
		Integer oldRemainingCapacityBasis = remainingCapacityBasis;
		remainingCapacityBasis = newRemainingCapacityBasis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__REMAINING_CAPACITY_BASIS, oldRemainingCapacityBasis, remainingCapacityBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRemainingCapacity() {
		return remainingCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingCapacity(Long newRemainingCapacity) {
		Long oldRemainingCapacity = remainingCapacity;
		remainingCapacity = newRemainingCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__REMAINING_CAPACITY, oldRemainingCapacity, remainingCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getColorantRole() {
		return colorantRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorantRole(Long newColorantRole) {
		Long oldColorantRole = colorantRole;
		colorantRole = newColorantRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__COLORANT_ROLE, oldColorantRole, colorantRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherColorantRole() {
		return otherColorantRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherColorantRole(String newOtherColorantRole) {
		String oldOtherColorantRole = otherColorantRole;
		otherColorantRole = newOtherColorantRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__OTHER_COLORANT_ROLE, oldOtherColorantRole, otherColorantRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getColorantName() {
		return colorantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorantName(Integer newColorantName) {
		Integer oldColorantName = colorantName;
		colorantName = newColorantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__COLORANT_NAME, oldColorantName, colorantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherColorantName() {
		return otherColorantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherColorantName(String newOtherColorantName) {
		String oldOtherColorantName = otherColorantName;
		otherColorantName = newOtherColorantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__OTHER_COLORANT_NAME, oldOtherColorantName, otherColorantName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getColorantTonality() {
		return colorantTonality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorantTonality(Long newColorantTonality) {
		Long oldColorantTonality = colorantTonality;
		colorantTonality = newColorantTonality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_SUPPLY__COLORANT_TONALITY, oldColorantTonality, colorantTonality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_SUPPLY__LOCALIZED_DESCRIPTION:
				return getLocalizedDescription();
			case CimPackage.CIM_PRINT_SUPPLY__CLASSIFICATION:
				return getClassification();
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_CLASSIFICATION:
				return getOtherClassification();
			case CimPackage.CIM_PRINT_SUPPLY__TYPE:
				return getType();
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
			case CimPackage.CIM_PRINT_SUPPLY__SUPPLY_UNIT:
				return getSupplyUnit();
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_SUPPLY_UNIT:
				return getOtherSupplyUnit();
			case CimPackage.CIM_PRINT_SUPPLY__MAX_CAPACITY_BASIS:
				return getMaxCapacityBasis();
			case CimPackage.CIM_PRINT_SUPPLY__MAX_CAPACITY:
				return getMaxCapacity();
			case CimPackage.CIM_PRINT_SUPPLY__REMAINING_CAPACITY_BASIS:
				return getRemainingCapacityBasis();
			case CimPackage.CIM_PRINT_SUPPLY__REMAINING_CAPACITY:
				return getRemainingCapacity();
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_ROLE:
				return getColorantRole();
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_COLORANT_ROLE:
				return getOtherColorantRole();
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_NAME:
				return getColorantName();
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_COLORANT_NAME:
				return getOtherColorantName();
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_TONALITY:
				return getColorantTonality();
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
			case CimPackage.CIM_PRINT_SUPPLY__LOCALIZED_DESCRIPTION:
				setLocalizedDescription((String)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__CLASSIFICATION:
				setClassification((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_CLASSIFICATION:
				setOtherClassification((String)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__TYPE:
				setType((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__SUPPLY_UNIT:
				setSupplyUnit((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_SUPPLY_UNIT:
				setOtherSupplyUnit((String)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__MAX_CAPACITY_BASIS:
				setMaxCapacityBasis((Integer)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__MAX_CAPACITY:
				setMaxCapacity((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__REMAINING_CAPACITY_BASIS:
				setRemainingCapacityBasis((Integer)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__REMAINING_CAPACITY:
				setRemainingCapacity((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_ROLE:
				setColorantRole((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_COLORANT_ROLE:
				setOtherColorantRole((String)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_NAME:
				setColorantName((Integer)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_COLORANT_NAME:
				setOtherColorantName((String)newValue);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_TONALITY:
				setColorantTonality((Long)newValue);
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
			case CimPackage.CIM_PRINT_SUPPLY__LOCALIZED_DESCRIPTION:
				setLocalizedDescription(LOCALIZED_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_CLASSIFICATION:
				setOtherClassification(OTHER_CLASSIFICATION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__SUPPLY_UNIT:
				setSupplyUnit(SUPPLY_UNIT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_SUPPLY_UNIT:
				setOtherSupplyUnit(OTHER_SUPPLY_UNIT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__MAX_CAPACITY_BASIS:
				setMaxCapacityBasis(MAX_CAPACITY_BASIS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__MAX_CAPACITY:
				setMaxCapacity(MAX_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__REMAINING_CAPACITY_BASIS:
				setRemainingCapacityBasis(REMAINING_CAPACITY_BASIS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__REMAINING_CAPACITY:
				setRemainingCapacity(REMAINING_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_ROLE:
				setColorantRole(COLORANT_ROLE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_COLORANT_ROLE:
				setOtherColorantRole(OTHER_COLORANT_ROLE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_NAME:
				setColorantName(COLORANT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_COLORANT_NAME:
				setOtherColorantName(OTHER_COLORANT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_TONALITY:
				setColorantTonality(COLORANT_TONALITY_EDEFAULT);
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
			case CimPackage.CIM_PRINT_SUPPLY__LOCALIZED_DESCRIPTION:
				return LOCALIZED_DESCRIPTION_EDEFAULT == null ? localizedDescription != null : !LOCALIZED_DESCRIPTION_EDEFAULT.equals(localizedDescription);
			case CimPackage.CIM_PRINT_SUPPLY__CLASSIFICATION:
				return CLASSIFICATION_EDEFAULT == null ? classification != null : !CLASSIFICATION_EDEFAULT.equals(classification);
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_CLASSIFICATION:
				return OTHER_CLASSIFICATION_EDEFAULT == null ? otherClassification != null : !OTHER_CLASSIFICATION_EDEFAULT.equals(otherClassification);
			case CimPackage.CIM_PRINT_SUPPLY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
			case CimPackage.CIM_PRINT_SUPPLY__SUPPLY_UNIT:
				return SUPPLY_UNIT_EDEFAULT == null ? supplyUnit != null : !SUPPLY_UNIT_EDEFAULT.equals(supplyUnit);
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_SUPPLY_UNIT:
				return OTHER_SUPPLY_UNIT_EDEFAULT == null ? otherSupplyUnit != null : !OTHER_SUPPLY_UNIT_EDEFAULT.equals(otherSupplyUnit);
			case CimPackage.CIM_PRINT_SUPPLY__MAX_CAPACITY_BASIS:
				return MAX_CAPACITY_BASIS_EDEFAULT == null ? maxCapacityBasis != null : !MAX_CAPACITY_BASIS_EDEFAULT.equals(maxCapacityBasis);
			case CimPackage.CIM_PRINT_SUPPLY__MAX_CAPACITY:
				return MAX_CAPACITY_EDEFAULT == null ? maxCapacity != null : !MAX_CAPACITY_EDEFAULT.equals(maxCapacity);
			case CimPackage.CIM_PRINT_SUPPLY__REMAINING_CAPACITY_BASIS:
				return REMAINING_CAPACITY_BASIS_EDEFAULT == null ? remainingCapacityBasis != null : !REMAINING_CAPACITY_BASIS_EDEFAULT.equals(remainingCapacityBasis);
			case CimPackage.CIM_PRINT_SUPPLY__REMAINING_CAPACITY:
				return REMAINING_CAPACITY_EDEFAULT == null ? remainingCapacity != null : !REMAINING_CAPACITY_EDEFAULT.equals(remainingCapacity);
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_ROLE:
				return COLORANT_ROLE_EDEFAULT == null ? colorantRole != null : !COLORANT_ROLE_EDEFAULT.equals(colorantRole);
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_COLORANT_ROLE:
				return OTHER_COLORANT_ROLE_EDEFAULT == null ? otherColorantRole != null : !OTHER_COLORANT_ROLE_EDEFAULT.equals(otherColorantRole);
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_NAME:
				return COLORANT_NAME_EDEFAULT == null ? colorantName != null : !COLORANT_NAME_EDEFAULT.equals(colorantName);
			case CimPackage.CIM_PRINT_SUPPLY__OTHER_COLORANT_NAME:
				return OTHER_COLORANT_NAME_EDEFAULT == null ? otherColorantName != null : !OTHER_COLORANT_NAME_EDEFAULT.equals(otherColorantName);
			case CimPackage.CIM_PRINT_SUPPLY__COLORANT_TONALITY:
				return COLORANT_TONALITY_EDEFAULT == null ? colorantTonality != null : !COLORANT_TONALITY_EDEFAULT.equals(colorantTonality);
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
		result.append(" (LocalizedDescription: ");
		result.append(localizedDescription);
		result.append(", Classification: ");
		result.append(classification);
		result.append(", OtherClassification: ");
		result.append(otherClassification);
		result.append(", Type: ");
		result.append(type);
		result.append(", OtherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(", SupplyUnit: ");
		result.append(supplyUnit);
		result.append(", OtherSupplyUnit: ");
		result.append(otherSupplyUnit);
		result.append(", MaxCapacityBasis: ");
		result.append(maxCapacityBasis);
		result.append(", MaxCapacity: ");
		result.append(maxCapacity);
		result.append(", RemainingCapacityBasis: ");
		result.append(remainingCapacityBasis);
		result.append(", RemainingCapacity: ");
		result.append(remainingCapacity);
		result.append(", ColorantRole: ");
		result.append(colorantRole);
		result.append(", OtherColorantRole: ");
		result.append(otherColorantRole);
		result.append(", ColorantName: ");
		result.append(colorantName);
		result.append(", OtherColorantName: ");
		result.append(otherColorantName);
		result.append(", ColorantTonality: ");
		result.append(colorantTonality);
		result.append(')');
		return result.toString();
	}

} //CIM_PrintSupplyImpl
