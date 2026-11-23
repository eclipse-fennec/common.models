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

import org.dmtf.cim.CIM_Processor;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getOtherFamilyDescription <em>Other Family Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getUpgradeMethod <em>Upgrade Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getMaxClockSpeed <em>Max Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getCurrentClockSpeed <em>Current Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getDataWidth <em>Data Width</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getAddressWidth <em>Address Width</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getLoadPercentage <em>Load Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getStepping <em>Stepping</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getUniqueID <em>Unique ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getCPUStatus <em>CPU Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getExternalBusClockSpeed <em>External Bus Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getEnabledProcessorCharacteristics <em>Enabled Processor Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProcessorImpl#getNumberOfEnabledCores <em>Number Of Enabled Cores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProcessorImpl extends CIM_LogicalDeviceImpl implements CIM_Processor {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected Integer family = FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherFamilyDescription() <em>Other Family Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherFamilyDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_FAMILY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherFamilyDescription() <em>Other Family Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherFamilyDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherFamilyDescription = OTHER_FAMILY_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpgradeMethod() <em>Upgrade Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPGRADE_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpgradeMethod() <em>Upgrade Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeMethod()
	 * @generated
	 * @ordered
	 */
	protected Integer upgradeMethod = UPGRADE_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxClockSpeed() <em>Max Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_CLOCK_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxClockSpeed() <em>Max Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long maxClockSpeed = MAX_CLOCK_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentClockSpeed() <em>Current Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_CLOCK_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentClockSpeed() <em>Current Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long currentClockSpeed = CURRENT_CLOCK_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataWidth() <em>Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataWidth() <em>Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer dataWidth = DATA_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressWidth() <em>Address Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESS_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressWidth() <em>Address Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer addressWidth = ADDRESS_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadPercentage() <em>Load Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOAD_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadPercentage() <em>Load Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadPercentage()
	 * @generated
	 * @ordered
	 */
	protected Integer loadPercentage = LOAD_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepping() <em>Stepping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepping()
	 * @generated
	 * @ordered
	 */
	protected static final String STEPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepping() <em>Stepping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepping()
	 * @generated
	 * @ordered
	 */
	protected String stepping = STEPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueID() <em>Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueID()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueID() <em>Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueID()
	 * @generated
	 * @ordered
	 */
	protected String uniqueID = UNIQUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCPUStatus() <em>CPU Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CPU_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPUStatus() <em>CPU Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPUStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer cpuStatus = CPU_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalBusClockSpeed() <em>External Bus Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalBusClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXTERNAL_BUS_CLOCK_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalBusClockSpeed() <em>External Bus Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalBusClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long externalBusClockSpeed = EXTERNAL_BUS_CLOCK_SPEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCharacteristics() <em>Characteristics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> characteristics;

	/**
	 * The cached value of the '{@link #getEnabledProcessorCharacteristics() <em>Enabled Processor Characteristics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledProcessorCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> enabledProcessorCharacteristics;

	/**
	 * The default value of the '{@link #getNumberOfEnabledCores() <em>Number Of Enabled Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEnabledCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_ENABLED_CORES_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getNumberOfEnabledCores() <em>Number Of Enabled Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfEnabledCores()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfEnabledCores = NUMBER_OF_ENABLED_CORES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Processor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFamily(Integer newFamily) {
		Integer oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherFamilyDescription() {
		return otherFamilyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherFamilyDescription(String newOtherFamilyDescription) {
		String oldOtherFamilyDescription = otherFamilyDescription;
		otherFamilyDescription = newOtherFamilyDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__OTHER_FAMILY_DESCRIPTION, oldOtherFamilyDescription, otherFamilyDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUpgradeMethod() {
		return upgradeMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpgradeMethod(Integer newUpgradeMethod) {
		Integer oldUpgradeMethod = upgradeMethod;
		upgradeMethod = newUpgradeMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__UPGRADE_METHOD, oldUpgradeMethod, upgradeMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxClockSpeed() {
		return maxClockSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxClockSpeed(Long newMaxClockSpeed) {
		Long oldMaxClockSpeed = maxClockSpeed;
		maxClockSpeed = newMaxClockSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__MAX_CLOCK_SPEED, oldMaxClockSpeed, maxClockSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentClockSpeed() {
		return currentClockSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentClockSpeed(Long newCurrentClockSpeed) {
		Long oldCurrentClockSpeed = currentClockSpeed;
		currentClockSpeed = newCurrentClockSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__CURRENT_CLOCK_SPEED, oldCurrentClockSpeed, currentClockSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataWidth() {
		return dataWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataWidth(Integer newDataWidth) {
		Integer oldDataWidth = dataWidth;
		dataWidth = newDataWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__DATA_WIDTH, oldDataWidth, dataWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressWidth() {
		return addressWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressWidth(Integer newAddressWidth) {
		Integer oldAddressWidth = addressWidth;
		addressWidth = newAddressWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__ADDRESS_WIDTH, oldAddressWidth, addressWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLoadPercentage() {
		return loadPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadPercentage(Integer newLoadPercentage) {
		Integer oldLoadPercentage = loadPercentage;
		loadPercentage = newLoadPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__LOAD_PERCENTAGE, oldLoadPercentage, loadPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStepping() {
		return stepping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepping(String newStepping) {
		String oldStepping = stepping;
		stepping = newStepping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__STEPPING, oldStepping, stepping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUniqueID() {
		return uniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniqueID(String newUniqueID) {
		String oldUniqueID = uniqueID;
		uniqueID = newUniqueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__UNIQUE_ID, oldUniqueID, uniqueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCPUStatus() {
		return cpuStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCPUStatus(Integer newCPUStatus) {
		Integer oldCPUStatus = cpuStatus;
		cpuStatus = newCPUStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__CPU_STATUS, oldCPUStatus, cpuStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExternalBusClockSpeed() {
		return externalBusClockSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalBusClockSpeed(Long newExternalBusClockSpeed) {
		Long oldExternalBusClockSpeed = externalBusClockSpeed;
		externalBusClockSpeed = newExternalBusClockSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__EXTERNAL_BUS_CLOCK_SPEED, oldExternalBusClockSpeed, externalBusClockSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCharacteristics() {
		if (characteristics == null) {
			characteristics = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PROCESSOR__CHARACTERISTICS);
		}
		return characteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEnabledProcessorCharacteristics() {
		if (enabledProcessorCharacteristics == null) {
			enabledProcessorCharacteristics = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PROCESSOR__ENABLED_PROCESSOR_CHARACTERISTICS);
		}
		return enabledProcessorCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfEnabledCores() {
		return numberOfEnabledCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfEnabledCores(Integer newNumberOfEnabledCores) {
		Integer oldNumberOfEnabledCores = numberOfEnabledCores;
		numberOfEnabledCores = newNumberOfEnabledCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROCESSOR__NUMBER_OF_ENABLED_CORES, oldNumberOfEnabledCores, numberOfEnabledCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROCESSOR__ROLE:
				return getRole();
			case CimPackage.CIM_PROCESSOR__FAMILY:
				return getFamily();
			case CimPackage.CIM_PROCESSOR__OTHER_FAMILY_DESCRIPTION:
				return getOtherFamilyDescription();
			case CimPackage.CIM_PROCESSOR__UPGRADE_METHOD:
				return getUpgradeMethod();
			case CimPackage.CIM_PROCESSOR__MAX_CLOCK_SPEED:
				return getMaxClockSpeed();
			case CimPackage.CIM_PROCESSOR__CURRENT_CLOCK_SPEED:
				return getCurrentClockSpeed();
			case CimPackage.CIM_PROCESSOR__DATA_WIDTH:
				return getDataWidth();
			case CimPackage.CIM_PROCESSOR__ADDRESS_WIDTH:
				return getAddressWidth();
			case CimPackage.CIM_PROCESSOR__LOAD_PERCENTAGE:
				return getLoadPercentage();
			case CimPackage.CIM_PROCESSOR__STEPPING:
				return getStepping();
			case CimPackage.CIM_PROCESSOR__UNIQUE_ID:
				return getUniqueID();
			case CimPackage.CIM_PROCESSOR__CPU_STATUS:
				return getCPUStatus();
			case CimPackage.CIM_PROCESSOR__EXTERNAL_BUS_CLOCK_SPEED:
				return getExternalBusClockSpeed();
			case CimPackage.CIM_PROCESSOR__CHARACTERISTICS:
				return getCharacteristics();
			case CimPackage.CIM_PROCESSOR__ENABLED_PROCESSOR_CHARACTERISTICS:
				return getEnabledProcessorCharacteristics();
			case CimPackage.CIM_PROCESSOR__NUMBER_OF_ENABLED_CORES:
				return getNumberOfEnabledCores();
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
			case CimPackage.CIM_PROCESSOR__ROLE:
				setRole((String)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__FAMILY:
				setFamily((Integer)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__OTHER_FAMILY_DESCRIPTION:
				setOtherFamilyDescription((String)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__UPGRADE_METHOD:
				setUpgradeMethod((Integer)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__MAX_CLOCK_SPEED:
				setMaxClockSpeed((Long)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__CURRENT_CLOCK_SPEED:
				setCurrentClockSpeed((Long)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__DATA_WIDTH:
				setDataWidth((Integer)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__ADDRESS_WIDTH:
				setAddressWidth((Integer)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__LOAD_PERCENTAGE:
				setLoadPercentage((Integer)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__STEPPING:
				setStepping((String)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__UNIQUE_ID:
				setUniqueID((String)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__CPU_STATUS:
				setCPUStatus((Integer)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__EXTERNAL_BUS_CLOCK_SPEED:
				setExternalBusClockSpeed((Long)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__CHARACTERISTICS:
				getCharacteristics().clear();
				getCharacteristics().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__ENABLED_PROCESSOR_CHARACTERISTICS:
				getEnabledProcessorCharacteristics().clear();
				getEnabledProcessorCharacteristics().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PROCESSOR__NUMBER_OF_ENABLED_CORES:
				setNumberOfEnabledCores((Integer)newValue);
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
			case CimPackage.CIM_PROCESSOR__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__OTHER_FAMILY_DESCRIPTION:
				setOtherFamilyDescription(OTHER_FAMILY_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__UPGRADE_METHOD:
				setUpgradeMethod(UPGRADE_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__MAX_CLOCK_SPEED:
				setMaxClockSpeed(MAX_CLOCK_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__CURRENT_CLOCK_SPEED:
				setCurrentClockSpeed(CURRENT_CLOCK_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__DATA_WIDTH:
				setDataWidth(DATA_WIDTH_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__ADDRESS_WIDTH:
				setAddressWidth(ADDRESS_WIDTH_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__LOAD_PERCENTAGE:
				setLoadPercentage(LOAD_PERCENTAGE_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__STEPPING:
				setStepping(STEPPING_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__UNIQUE_ID:
				setUniqueID(UNIQUE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__CPU_STATUS:
				setCPUStatus(CPU_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__EXTERNAL_BUS_CLOCK_SPEED:
				setExternalBusClockSpeed(EXTERNAL_BUS_CLOCK_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_PROCESSOR__CHARACTERISTICS:
				getCharacteristics().clear();
				return;
			case CimPackage.CIM_PROCESSOR__ENABLED_PROCESSOR_CHARACTERISTICS:
				getEnabledProcessorCharacteristics().clear();
				return;
			case CimPackage.CIM_PROCESSOR__NUMBER_OF_ENABLED_CORES:
				setNumberOfEnabledCores(NUMBER_OF_ENABLED_CORES_EDEFAULT);
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
			case CimPackage.CIM_PROCESSOR__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CimPackage.CIM_PROCESSOR__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
			case CimPackage.CIM_PROCESSOR__OTHER_FAMILY_DESCRIPTION:
				return OTHER_FAMILY_DESCRIPTION_EDEFAULT == null ? otherFamilyDescription != null : !OTHER_FAMILY_DESCRIPTION_EDEFAULT.equals(otherFamilyDescription);
			case CimPackage.CIM_PROCESSOR__UPGRADE_METHOD:
				return UPGRADE_METHOD_EDEFAULT == null ? upgradeMethod != null : !UPGRADE_METHOD_EDEFAULT.equals(upgradeMethod);
			case CimPackage.CIM_PROCESSOR__MAX_CLOCK_SPEED:
				return MAX_CLOCK_SPEED_EDEFAULT == null ? maxClockSpeed != null : !MAX_CLOCK_SPEED_EDEFAULT.equals(maxClockSpeed);
			case CimPackage.CIM_PROCESSOR__CURRENT_CLOCK_SPEED:
				return CURRENT_CLOCK_SPEED_EDEFAULT == null ? currentClockSpeed != null : !CURRENT_CLOCK_SPEED_EDEFAULT.equals(currentClockSpeed);
			case CimPackage.CIM_PROCESSOR__DATA_WIDTH:
				return DATA_WIDTH_EDEFAULT == null ? dataWidth != null : !DATA_WIDTH_EDEFAULT.equals(dataWidth);
			case CimPackage.CIM_PROCESSOR__ADDRESS_WIDTH:
				return ADDRESS_WIDTH_EDEFAULT == null ? addressWidth != null : !ADDRESS_WIDTH_EDEFAULT.equals(addressWidth);
			case CimPackage.CIM_PROCESSOR__LOAD_PERCENTAGE:
				return LOAD_PERCENTAGE_EDEFAULT == null ? loadPercentage != null : !LOAD_PERCENTAGE_EDEFAULT.equals(loadPercentage);
			case CimPackage.CIM_PROCESSOR__STEPPING:
				return STEPPING_EDEFAULT == null ? stepping != null : !STEPPING_EDEFAULT.equals(stepping);
			case CimPackage.CIM_PROCESSOR__UNIQUE_ID:
				return UNIQUE_ID_EDEFAULT == null ? uniqueID != null : !UNIQUE_ID_EDEFAULT.equals(uniqueID);
			case CimPackage.CIM_PROCESSOR__CPU_STATUS:
				return CPU_STATUS_EDEFAULT == null ? cpuStatus != null : !CPU_STATUS_EDEFAULT.equals(cpuStatus);
			case CimPackage.CIM_PROCESSOR__EXTERNAL_BUS_CLOCK_SPEED:
				return EXTERNAL_BUS_CLOCK_SPEED_EDEFAULT == null ? externalBusClockSpeed != null : !EXTERNAL_BUS_CLOCK_SPEED_EDEFAULT.equals(externalBusClockSpeed);
			case CimPackage.CIM_PROCESSOR__CHARACTERISTICS:
				return characteristics != null && !characteristics.isEmpty();
			case CimPackage.CIM_PROCESSOR__ENABLED_PROCESSOR_CHARACTERISTICS:
				return enabledProcessorCharacteristics != null && !enabledProcessorCharacteristics.isEmpty();
			case CimPackage.CIM_PROCESSOR__NUMBER_OF_ENABLED_CORES:
				return NUMBER_OF_ENABLED_CORES_EDEFAULT == null ? numberOfEnabledCores != null : !NUMBER_OF_ENABLED_CORES_EDEFAULT.equals(numberOfEnabledCores);
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
		result.append(" (Role: ");
		result.append(role);
		result.append(", Family: ");
		result.append(family);
		result.append(", OtherFamilyDescription: ");
		result.append(otherFamilyDescription);
		result.append(", UpgradeMethod: ");
		result.append(upgradeMethod);
		result.append(", MaxClockSpeed: ");
		result.append(maxClockSpeed);
		result.append(", CurrentClockSpeed: ");
		result.append(currentClockSpeed);
		result.append(", DataWidth: ");
		result.append(dataWidth);
		result.append(", AddressWidth: ");
		result.append(addressWidth);
		result.append(", LoadPercentage: ");
		result.append(loadPercentage);
		result.append(", Stepping: ");
		result.append(stepping);
		result.append(", UniqueID: ");
		result.append(uniqueID);
		result.append(", CPUStatus: ");
		result.append(cpuStatus);
		result.append(", ExternalBusClockSpeed: ");
		result.append(externalBusClockSpeed);
		result.append(", Characteristics: ");
		result.append(characteristics);
		result.append(", EnabledProcessorCharacteristics: ");
		result.append(enabledProcessorCharacteristics);
		result.append(", NumberOfEnabledCores: ");
		result.append(numberOfEnabledCores);
		result.append(')');
		return result.toString();
	}

} //CIM_ProcessorImpl
