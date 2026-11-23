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

import org.dmtf.cim.CIM_Chassis;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Chassis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getNumberOfPowerCords <em>Number Of Power Cords</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getCurrentRequiredOrProduced <em>Current Required Or Produced</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getHeatGeneration <em>Heat Generation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getChassisTypes <em>Chassis Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getTypeDescriptions <em>Type Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getChassisPackageType <em>Chassis Package Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getChassisTypeDescription <em>Chassis Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getMultipleSystemSupport <em>Multiple System Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getRackMountable <em>Rack Mountable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getInputCurrentType <em>Input Current Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getInputVoltage <em>Input Voltage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChassisImpl#getOtherInputCurrentType <em>Other Input Current Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ChassisImpl extends CIM_PhysicalFrameImpl implements CIM_Chassis {
	/**
	 * The default value of the '{@link #getNumberOfPowerCords() <em>Number Of Power Cords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPowerCords()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_POWER_CORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfPowerCords() <em>Number Of Power Cords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPowerCords()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfPowerCords = NUMBER_OF_POWER_CORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentRequiredOrProduced() <em>Current Required Or Produced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRequiredOrProduced()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_REQUIRED_OR_PRODUCED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentRequiredOrProduced() <em>Current Required Or Produced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRequiredOrProduced()
	 * @generated
	 * @ordered
	 */
	protected Integer currentRequiredOrProduced = CURRENT_REQUIRED_OR_PRODUCED_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeatGeneration() <em>Heat Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatGeneration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEAT_GENERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeatGeneration() <em>Heat Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatGeneration()
	 * @generated
	 * @ordered
	 */
	protected Integer heatGeneration = HEAT_GENERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChassisTypes() <em>Chassis Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChassisTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> chassisTypes;

	/**
	 * The cached value of the '{@link #getTypeDescriptions() <em>Type Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> typeDescriptions;

	/**
	 * The default value of the '{@link #getChassisPackageType() <em>Chassis Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChassisPackageType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHASSIS_PACKAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChassisPackageType() <em>Chassis Package Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChassisPackageType()
	 * @generated
	 * @ordered
	 */
	protected Integer chassisPackageType = CHASSIS_PACKAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChassisTypeDescription() <em>Chassis Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChassisTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CHASSIS_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChassisTypeDescription() <em>Chassis Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChassisTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String chassisTypeDescription = CHASSIS_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipleSystemSupport() <em>Multiple System Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleSystemSupport()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MULTIPLE_SYSTEM_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipleSystemSupport() <em>Multiple System Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleSystemSupport()
	 * @generated
	 * @ordered
	 */
	protected Integer multipleSystemSupport = MULTIPLE_SYSTEM_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRackMountable() <em>Rack Mountable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRackMountable()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RACK_MOUNTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRackMountable() <em>Rack Mountable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRackMountable()
	 * @generated
	 * @ordered
	 */
	protected Integer rackMountable = RACK_MOUNTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputCurrentType() <em>Input Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputCurrentType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INPUT_CURRENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputCurrentType() <em>Input Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputCurrentType()
	 * @generated
	 * @ordered
	 */
	protected Integer inputCurrentType = INPUT_CURRENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputVoltage() <em>Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INPUT_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputVoltage() <em>Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVoltage()
	 * @generated
	 * @ordered
	 */
	protected Integer inputVoltage = INPUT_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherInputCurrentType() <em>Other Input Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherInputCurrentType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_INPUT_CURRENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherInputCurrentType() <em>Other Input Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherInputCurrentType()
	 * @generated
	 * @ordered
	 */
	protected String otherInputCurrentType = OTHER_INPUT_CURRENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ChassisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Chassis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfPowerCords() {
		return numberOfPowerCords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfPowerCords(Integer newNumberOfPowerCords) {
		Integer oldNumberOfPowerCords = numberOfPowerCords;
		numberOfPowerCords = newNumberOfPowerCords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHASSIS__NUMBER_OF_POWER_CORDS, oldNumberOfPowerCords, numberOfPowerCords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentRequiredOrProduced() {
		return currentRequiredOrProduced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentRequiredOrProduced(Integer newCurrentRequiredOrProduced) {
		Integer oldCurrentRequiredOrProduced = currentRequiredOrProduced;
		currentRequiredOrProduced = newCurrentRequiredOrProduced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHASSIS__CURRENT_REQUIRED_OR_PRODUCED, oldCurrentRequiredOrProduced, currentRequiredOrProduced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHeatGeneration() {
		return heatGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeatGeneration(Integer newHeatGeneration) {
		Integer oldHeatGeneration = heatGeneration;
		heatGeneration = newHeatGeneration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHASSIS__HEAT_GENERATION, oldHeatGeneration, heatGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getChassisTypes() {
		if (chassisTypes == null) {
			chassisTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CHASSIS__CHASSIS_TYPES);
		}
		return chassisTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTypeDescriptions() {
		if (typeDescriptions == null) {
			typeDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_CHASSIS__TYPE_DESCRIPTIONS);
		}
		return typeDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getChassisPackageType() {
		return chassisPackageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChassisPackageType(Integer newChassisPackageType) {
		Integer oldChassisPackageType = chassisPackageType;
		chassisPackageType = newChassisPackageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHASSIS__CHASSIS_PACKAGE_TYPE, oldChassisPackageType, chassisPackageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChassisTypeDescription() {
		return chassisTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChassisTypeDescription(String newChassisTypeDescription) {
		String oldChassisTypeDescription = chassisTypeDescription;
		chassisTypeDescription = newChassisTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHASSIS__CHASSIS_TYPE_DESCRIPTION, oldChassisTypeDescription, chassisTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMultipleSystemSupport() {
		return multipleSystemSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleSystemSupport(Integer newMultipleSystemSupport) {
		Integer oldMultipleSystemSupport = multipleSystemSupport;
		multipleSystemSupport = newMultipleSystemSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHASSIS__MULTIPLE_SYSTEM_SUPPORT, oldMultipleSystemSupport, multipleSystemSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRackMountable() {
		return rackMountable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRackMountable(Integer newRackMountable) {
		Integer oldRackMountable = rackMountable;
		rackMountable = newRackMountable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHASSIS__RACK_MOUNTABLE, oldRackMountable, rackMountable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInputCurrentType() {
		return inputCurrentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputCurrentType(Integer newInputCurrentType) {
		Integer oldInputCurrentType = inputCurrentType;
		inputCurrentType = newInputCurrentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHASSIS__INPUT_CURRENT_TYPE, oldInputCurrentType, inputCurrentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInputVoltage() {
		return inputVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputVoltage(Integer newInputVoltage) {
		Integer oldInputVoltage = inputVoltage;
		inputVoltage = newInputVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHASSIS__INPUT_VOLTAGE, oldInputVoltage, inputVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherInputCurrentType() {
		return otherInputCurrentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherInputCurrentType(String newOtherInputCurrentType) {
		String oldOtherInputCurrentType = otherInputCurrentType;
		otherInputCurrentType = newOtherInputCurrentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHASSIS__OTHER_INPUT_CURRENT_TYPE, oldOtherInputCurrentType, otherInputCurrentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CHASSIS__NUMBER_OF_POWER_CORDS:
				return getNumberOfPowerCords();
			case CimPackage.CIM_CHASSIS__CURRENT_REQUIRED_OR_PRODUCED:
				return getCurrentRequiredOrProduced();
			case CimPackage.CIM_CHASSIS__HEAT_GENERATION:
				return getHeatGeneration();
			case CimPackage.CIM_CHASSIS__CHASSIS_TYPES:
				return getChassisTypes();
			case CimPackage.CIM_CHASSIS__TYPE_DESCRIPTIONS:
				return getTypeDescriptions();
			case CimPackage.CIM_CHASSIS__CHASSIS_PACKAGE_TYPE:
				return getChassisPackageType();
			case CimPackage.CIM_CHASSIS__CHASSIS_TYPE_DESCRIPTION:
				return getChassisTypeDescription();
			case CimPackage.CIM_CHASSIS__MULTIPLE_SYSTEM_SUPPORT:
				return getMultipleSystemSupport();
			case CimPackage.CIM_CHASSIS__RACK_MOUNTABLE:
				return getRackMountable();
			case CimPackage.CIM_CHASSIS__INPUT_CURRENT_TYPE:
				return getInputCurrentType();
			case CimPackage.CIM_CHASSIS__INPUT_VOLTAGE:
				return getInputVoltage();
			case CimPackage.CIM_CHASSIS__OTHER_INPUT_CURRENT_TYPE:
				return getOtherInputCurrentType();
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
			case CimPackage.CIM_CHASSIS__NUMBER_OF_POWER_CORDS:
				setNumberOfPowerCords((Integer)newValue);
				return;
			case CimPackage.CIM_CHASSIS__CURRENT_REQUIRED_OR_PRODUCED:
				setCurrentRequiredOrProduced((Integer)newValue);
				return;
			case CimPackage.CIM_CHASSIS__HEAT_GENERATION:
				setHeatGeneration((Integer)newValue);
				return;
			case CimPackage.CIM_CHASSIS__CHASSIS_TYPES:
				getChassisTypes().clear();
				getChassisTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_CHASSIS__TYPE_DESCRIPTIONS:
				getTypeDescriptions().clear();
				getTypeDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_CHASSIS__CHASSIS_PACKAGE_TYPE:
				setChassisPackageType((Integer)newValue);
				return;
			case CimPackage.CIM_CHASSIS__CHASSIS_TYPE_DESCRIPTION:
				setChassisTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_CHASSIS__MULTIPLE_SYSTEM_SUPPORT:
				setMultipleSystemSupport((Integer)newValue);
				return;
			case CimPackage.CIM_CHASSIS__RACK_MOUNTABLE:
				setRackMountable((Integer)newValue);
				return;
			case CimPackage.CIM_CHASSIS__INPUT_CURRENT_TYPE:
				setInputCurrentType((Integer)newValue);
				return;
			case CimPackage.CIM_CHASSIS__INPUT_VOLTAGE:
				setInputVoltage((Integer)newValue);
				return;
			case CimPackage.CIM_CHASSIS__OTHER_INPUT_CURRENT_TYPE:
				setOtherInputCurrentType((String)newValue);
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
			case CimPackage.CIM_CHASSIS__NUMBER_OF_POWER_CORDS:
				setNumberOfPowerCords(NUMBER_OF_POWER_CORDS_EDEFAULT);
				return;
			case CimPackage.CIM_CHASSIS__CURRENT_REQUIRED_OR_PRODUCED:
				setCurrentRequiredOrProduced(CURRENT_REQUIRED_OR_PRODUCED_EDEFAULT);
				return;
			case CimPackage.CIM_CHASSIS__HEAT_GENERATION:
				setHeatGeneration(HEAT_GENERATION_EDEFAULT);
				return;
			case CimPackage.CIM_CHASSIS__CHASSIS_TYPES:
				getChassisTypes().clear();
				return;
			case CimPackage.CIM_CHASSIS__TYPE_DESCRIPTIONS:
				getTypeDescriptions().clear();
				return;
			case CimPackage.CIM_CHASSIS__CHASSIS_PACKAGE_TYPE:
				setChassisPackageType(CHASSIS_PACKAGE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_CHASSIS__CHASSIS_TYPE_DESCRIPTION:
				setChassisTypeDescription(CHASSIS_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_CHASSIS__MULTIPLE_SYSTEM_SUPPORT:
				setMultipleSystemSupport(MULTIPLE_SYSTEM_SUPPORT_EDEFAULT);
				return;
			case CimPackage.CIM_CHASSIS__RACK_MOUNTABLE:
				setRackMountable(RACK_MOUNTABLE_EDEFAULT);
				return;
			case CimPackage.CIM_CHASSIS__INPUT_CURRENT_TYPE:
				setInputCurrentType(INPUT_CURRENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_CHASSIS__INPUT_VOLTAGE:
				setInputVoltage(INPUT_VOLTAGE_EDEFAULT);
				return;
			case CimPackage.CIM_CHASSIS__OTHER_INPUT_CURRENT_TYPE:
				setOtherInputCurrentType(OTHER_INPUT_CURRENT_TYPE_EDEFAULT);
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
			case CimPackage.CIM_CHASSIS__NUMBER_OF_POWER_CORDS:
				return NUMBER_OF_POWER_CORDS_EDEFAULT == null ? numberOfPowerCords != null : !NUMBER_OF_POWER_CORDS_EDEFAULT.equals(numberOfPowerCords);
			case CimPackage.CIM_CHASSIS__CURRENT_REQUIRED_OR_PRODUCED:
				return CURRENT_REQUIRED_OR_PRODUCED_EDEFAULT == null ? currentRequiredOrProduced != null : !CURRENT_REQUIRED_OR_PRODUCED_EDEFAULT.equals(currentRequiredOrProduced);
			case CimPackage.CIM_CHASSIS__HEAT_GENERATION:
				return HEAT_GENERATION_EDEFAULT == null ? heatGeneration != null : !HEAT_GENERATION_EDEFAULT.equals(heatGeneration);
			case CimPackage.CIM_CHASSIS__CHASSIS_TYPES:
				return chassisTypes != null && !chassisTypes.isEmpty();
			case CimPackage.CIM_CHASSIS__TYPE_DESCRIPTIONS:
				return typeDescriptions != null && !typeDescriptions.isEmpty();
			case CimPackage.CIM_CHASSIS__CHASSIS_PACKAGE_TYPE:
				return CHASSIS_PACKAGE_TYPE_EDEFAULT == null ? chassisPackageType != null : !CHASSIS_PACKAGE_TYPE_EDEFAULT.equals(chassisPackageType);
			case CimPackage.CIM_CHASSIS__CHASSIS_TYPE_DESCRIPTION:
				return CHASSIS_TYPE_DESCRIPTION_EDEFAULT == null ? chassisTypeDescription != null : !CHASSIS_TYPE_DESCRIPTION_EDEFAULT.equals(chassisTypeDescription);
			case CimPackage.CIM_CHASSIS__MULTIPLE_SYSTEM_SUPPORT:
				return MULTIPLE_SYSTEM_SUPPORT_EDEFAULT == null ? multipleSystemSupport != null : !MULTIPLE_SYSTEM_SUPPORT_EDEFAULT.equals(multipleSystemSupport);
			case CimPackage.CIM_CHASSIS__RACK_MOUNTABLE:
				return RACK_MOUNTABLE_EDEFAULT == null ? rackMountable != null : !RACK_MOUNTABLE_EDEFAULT.equals(rackMountable);
			case CimPackage.CIM_CHASSIS__INPUT_CURRENT_TYPE:
				return INPUT_CURRENT_TYPE_EDEFAULT == null ? inputCurrentType != null : !INPUT_CURRENT_TYPE_EDEFAULT.equals(inputCurrentType);
			case CimPackage.CIM_CHASSIS__INPUT_VOLTAGE:
				return INPUT_VOLTAGE_EDEFAULT == null ? inputVoltage != null : !INPUT_VOLTAGE_EDEFAULT.equals(inputVoltage);
			case CimPackage.CIM_CHASSIS__OTHER_INPUT_CURRENT_TYPE:
				return OTHER_INPUT_CURRENT_TYPE_EDEFAULT == null ? otherInputCurrentType != null : !OTHER_INPUT_CURRENT_TYPE_EDEFAULT.equals(otherInputCurrentType);
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
		result.append(" (NumberOfPowerCords: ");
		result.append(numberOfPowerCords);
		result.append(", CurrentRequiredOrProduced: ");
		result.append(currentRequiredOrProduced);
		result.append(", HeatGeneration: ");
		result.append(heatGeneration);
		result.append(", ChassisTypes: ");
		result.append(chassisTypes);
		result.append(", TypeDescriptions: ");
		result.append(typeDescriptions);
		result.append(", ChassisPackageType: ");
		result.append(chassisPackageType);
		result.append(", ChassisTypeDescription: ");
		result.append(chassisTypeDescription);
		result.append(", MultipleSystemSupport: ");
		result.append(multipleSystemSupport);
		result.append(", RackMountable: ");
		result.append(rackMountable);
		result.append(", InputCurrentType: ");
		result.append(inputCurrentType);
		result.append(", InputVoltage: ");
		result.append(inputVoltage);
		result.append(", OtherInputCurrentType: ");
		result.append(otherInputCurrentType);
		result.append(')');
		return result.toString();
	}

} //CIM_ChassisImpl
