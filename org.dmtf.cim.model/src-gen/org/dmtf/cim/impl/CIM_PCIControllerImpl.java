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

import org.dmtf.cim.CIM_PCIController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM PCI Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIControllerImpl#getCommandRegister <em>Command Register</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIControllerImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIControllerImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIControllerImpl#getDeviceSelectTiming <em>Device Select Timing</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIControllerImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIControllerImpl#getCacheLineSize <em>Cache Line Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIControllerImpl#getLatencyTimer <em>Latency Timer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIControllerImpl#getInterruptPin <em>Interrupt Pin</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIControllerImpl#getExpansionROMBaseAddress <em>Expansion ROM Base Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIControllerImpl#getSelfTestEnabled <em>Self Test Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PCIControllerImpl extends CIM_ControllerImpl implements CIM_PCIController {
	/**
	 * The default value of the '{@link #getCommandRegister() <em>Command Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandRegister()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMMAND_REGISTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandRegister() <em>Command Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandRegister()
	 * @generated
	 * @ordered
	 */
	protected Integer commandRegister = COMMAND_REGISTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilityDescriptions;

	/**
	 * The default value of the '{@link #getDeviceSelectTiming() <em>Device Select Timing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceSelectTiming()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEVICE_SELECT_TIMING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceSelectTiming() <em>Device Select Timing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceSelectTiming()
	 * @generated
	 * @ordered
	 */
	protected Integer deviceSelectTiming = DEVICE_SELECT_TIMING_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLASS_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected Integer classCode = CLASS_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheLineSize() <em>Cache Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheLineSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CACHE_LINE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheLineSize() <em>Cache Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheLineSize()
	 * @generated
	 * @ordered
	 */
	protected Integer cacheLineSize = CACHE_LINE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatencyTimer() <em>Latency Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyTimer()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LATENCY_TIMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatencyTimer() <em>Latency Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyTimer()
	 * @generated
	 * @ordered
	 */
	protected Integer latencyTimer = LATENCY_TIMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterruptPin() <em>Interrupt Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptPin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INTERRUPT_PIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterruptPin() <em>Interrupt Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptPin()
	 * @generated
	 * @ordered
	 */
	protected Integer interruptPin = INTERRUPT_PIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpansionROMBaseAddress() <em>Expansion ROM Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpansionROMBaseAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXPANSION_ROM_BASE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpansionROMBaseAddress() <em>Expansion ROM Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpansionROMBaseAddress()
	 * @generated
	 * @ordered
	 */
	protected Long expansionROMBaseAddress = EXPANSION_ROM_BASE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelfTestEnabled() <em>Self Test Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfTestEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SELF_TEST_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelfTestEnabled() <em>Self Test Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfTestEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean selfTestEnabled = SELF_TEST_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PCIControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PCIController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCommandRegister() {
		return commandRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommandRegister(Integer newCommandRegister) {
		Integer oldCommandRegister = commandRegister;
		commandRegister = newCommandRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_CONTROLLER__COMMAND_REGISTER, oldCommandRegister, commandRegister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PCI_CONTROLLER__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapabilityDescriptions() {
		if (capabilityDescriptions == null) {
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PCI_CONTROLLER__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeviceSelectTiming() {
		return deviceSelectTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceSelectTiming(Integer newDeviceSelectTiming) {
		Integer oldDeviceSelectTiming = deviceSelectTiming;
		deviceSelectTiming = newDeviceSelectTiming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_CONTROLLER__DEVICE_SELECT_TIMING, oldDeviceSelectTiming, deviceSelectTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassCode(Integer newClassCode) {
		Integer oldClassCode = classCode;
		classCode = newClassCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_CONTROLLER__CLASS_CODE, oldClassCode, classCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCacheLineSize() {
		return cacheLineSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheLineSize(Integer newCacheLineSize) {
		Integer oldCacheLineSize = cacheLineSize;
		cacheLineSize = newCacheLineSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_CONTROLLER__CACHE_LINE_SIZE, oldCacheLineSize, cacheLineSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLatencyTimer() {
		return latencyTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatencyTimer(Integer newLatencyTimer) {
		Integer oldLatencyTimer = latencyTimer;
		latencyTimer = newLatencyTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_CONTROLLER__LATENCY_TIMER, oldLatencyTimer, latencyTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInterruptPin() {
		return interruptPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterruptPin(Integer newInterruptPin) {
		Integer oldInterruptPin = interruptPin;
		interruptPin = newInterruptPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_CONTROLLER__INTERRUPT_PIN, oldInterruptPin, interruptPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExpansionROMBaseAddress() {
		return expansionROMBaseAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpansionROMBaseAddress(Long newExpansionROMBaseAddress) {
		Long oldExpansionROMBaseAddress = expansionROMBaseAddress;
		expansionROMBaseAddress = newExpansionROMBaseAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_CONTROLLER__EXPANSION_ROM_BASE_ADDRESS, oldExpansionROMBaseAddress, expansionROMBaseAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSelfTestEnabled() {
		return selfTestEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelfTestEnabled(Boolean newSelfTestEnabled) {
		Boolean oldSelfTestEnabled = selfTestEnabled;
		selfTestEnabled = newSelfTestEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_CONTROLLER__SELF_TEST_ENABLED, oldSelfTestEnabled, selfTestEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer BISTExecution() {
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
			case CimPackage.CIM_PCI_CONTROLLER__COMMAND_REGISTER:
				return getCommandRegister();
			case CimPackage.CIM_PCI_CONTROLLER__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_PCI_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_PCI_CONTROLLER__DEVICE_SELECT_TIMING:
				return getDeviceSelectTiming();
			case CimPackage.CIM_PCI_CONTROLLER__CLASS_CODE:
				return getClassCode();
			case CimPackage.CIM_PCI_CONTROLLER__CACHE_LINE_SIZE:
				return getCacheLineSize();
			case CimPackage.CIM_PCI_CONTROLLER__LATENCY_TIMER:
				return getLatencyTimer();
			case CimPackage.CIM_PCI_CONTROLLER__INTERRUPT_PIN:
				return getInterruptPin();
			case CimPackage.CIM_PCI_CONTROLLER__EXPANSION_ROM_BASE_ADDRESS:
				return getExpansionROMBaseAddress();
			case CimPackage.CIM_PCI_CONTROLLER__SELF_TEST_ENABLED:
				return getSelfTestEnabled();
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
			case CimPackage.CIM_PCI_CONTROLLER__COMMAND_REGISTER:
				setCommandRegister((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__DEVICE_SELECT_TIMING:
				setDeviceSelectTiming((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__CLASS_CODE:
				setClassCode((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__CACHE_LINE_SIZE:
				setCacheLineSize((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__LATENCY_TIMER:
				setLatencyTimer((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__INTERRUPT_PIN:
				setInterruptPin((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__EXPANSION_ROM_BASE_ADDRESS:
				setExpansionROMBaseAddress((Long)newValue);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__SELF_TEST_ENABLED:
				setSelfTestEnabled((Boolean)newValue);
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
			case CimPackage.CIM_PCI_CONTROLLER__COMMAND_REGISTER:
				setCommandRegister(COMMAND_REGISTER_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_PCI_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_PCI_CONTROLLER__DEVICE_SELECT_TIMING:
				setDeviceSelectTiming(DEVICE_SELECT_TIMING_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__CLASS_CODE:
				setClassCode(CLASS_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__CACHE_LINE_SIZE:
				setCacheLineSize(CACHE_LINE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__LATENCY_TIMER:
				setLatencyTimer(LATENCY_TIMER_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__INTERRUPT_PIN:
				setInterruptPin(INTERRUPT_PIN_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__EXPANSION_ROM_BASE_ADDRESS:
				setExpansionROMBaseAddress(EXPANSION_ROM_BASE_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_CONTROLLER__SELF_TEST_ENABLED:
				setSelfTestEnabled(SELF_TEST_ENABLED_EDEFAULT);
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
			case CimPackage.CIM_PCI_CONTROLLER__COMMAND_REGISTER:
				return COMMAND_REGISTER_EDEFAULT == null ? commandRegister != null : !COMMAND_REGISTER_EDEFAULT.equals(commandRegister);
			case CimPackage.CIM_PCI_CONTROLLER__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_PCI_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_PCI_CONTROLLER__DEVICE_SELECT_TIMING:
				return DEVICE_SELECT_TIMING_EDEFAULT == null ? deviceSelectTiming != null : !DEVICE_SELECT_TIMING_EDEFAULT.equals(deviceSelectTiming);
			case CimPackage.CIM_PCI_CONTROLLER__CLASS_CODE:
				return CLASS_CODE_EDEFAULT == null ? classCode != null : !CLASS_CODE_EDEFAULT.equals(classCode);
			case CimPackage.CIM_PCI_CONTROLLER__CACHE_LINE_SIZE:
				return CACHE_LINE_SIZE_EDEFAULT == null ? cacheLineSize != null : !CACHE_LINE_SIZE_EDEFAULT.equals(cacheLineSize);
			case CimPackage.CIM_PCI_CONTROLLER__LATENCY_TIMER:
				return LATENCY_TIMER_EDEFAULT == null ? latencyTimer != null : !LATENCY_TIMER_EDEFAULT.equals(latencyTimer);
			case CimPackage.CIM_PCI_CONTROLLER__INTERRUPT_PIN:
				return INTERRUPT_PIN_EDEFAULT == null ? interruptPin != null : !INTERRUPT_PIN_EDEFAULT.equals(interruptPin);
			case CimPackage.CIM_PCI_CONTROLLER__EXPANSION_ROM_BASE_ADDRESS:
				return EXPANSION_ROM_BASE_ADDRESS_EDEFAULT == null ? expansionROMBaseAddress != null : !EXPANSION_ROM_BASE_ADDRESS_EDEFAULT.equals(expansionROMBaseAddress);
			case CimPackage.CIM_PCI_CONTROLLER__SELF_TEST_ENABLED:
				return SELF_TEST_ENABLED_EDEFAULT == null ? selfTestEnabled != null : !SELF_TEST_ENABLED_EDEFAULT.equals(selfTestEnabled);
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
			case CimPackage.CIM_PCI_CONTROLLER___BIST_EXECUTION:
				return BISTExecution();
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
		result.append(" (CommandRegister: ");
		result.append(commandRegister);
		result.append(", Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", DeviceSelectTiming: ");
		result.append(deviceSelectTiming);
		result.append(", ClassCode: ");
		result.append(classCode);
		result.append(", CacheLineSize: ");
		result.append(cacheLineSize);
		result.append(", LatencyTimer: ");
		result.append(latencyTimer);
		result.append(", InterruptPin: ");
		result.append(interruptPin);
		result.append(", ExpansionROMBaseAddress: ");
		result.append(expansionROMBaseAddress);
		result.append(", SelfTestEnabled: ");
		result.append(selfTestEnabled);
		result.append(')');
		return result.toString();
	}

} //CIM_PCIControllerImpl
