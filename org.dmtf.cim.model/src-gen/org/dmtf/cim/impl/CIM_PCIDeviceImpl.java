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

import org.dmtf.cim.CIM_PCIDevice;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM PCI Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIDeviceImpl#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIDeviceImpl#getSubsystemID <em>Subsystem ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIDeviceImpl#getSubsystemVendorID <em>Subsystem Vendor ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIDeviceImpl#getMinGrantTime <em>Min Grant Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIDeviceImpl#getMaxLatency <em>Max Latency</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIDeviceImpl#getBusNumber <em>Bus Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIDeviceImpl#getDeviceNumber <em>Device Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIDeviceImpl#getFunctionNumber <em>Function Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIDeviceImpl#getPCIDeviceID <em>PCI Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIDeviceImpl#getVendorID <em>Vendor ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIDeviceImpl#getRevisionID <em>Revision ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PCIDeviceImpl extends CIM_PCIControllerImpl implements CIM_PCIDevice {
	/**
	 * The cached value of the '{@link #getBaseAddress() <em>Base Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> baseAddress;

	/**
	 * The default value of the '{@link #getSubsystemID() <em>Subsystem ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUBSYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubsystemID() <em>Subsystem ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemID()
	 * @generated
	 * @ordered
	 */
	protected Integer subsystemID = SUBSYSTEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubsystemVendorID() <em>Subsystem Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemVendorID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUBSYSTEM_VENDOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubsystemVendorID() <em>Subsystem Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemVendorID()
	 * @generated
	 * @ordered
	 */
	protected Integer subsystemVendorID = SUBSYSTEM_VENDOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinGrantTime() <em>Min Grant Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinGrantTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_GRANT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinGrantTime() <em>Min Grant Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinGrantTime()
	 * @generated
	 * @ordered
	 */
	protected Integer minGrantTime = MIN_GRANT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLatency() <em>Max Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLatency()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LATENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLatency() <em>Max Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLatency()
	 * @generated
	 * @ordered
	 */
	protected Integer maxLatency = MAX_LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusNumber() <em>Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BUS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusNumber() <em>Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer busNumber = BUS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceNumber() <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEVICE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceNumber() <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer deviceNumber = DEVICE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionNumber() <em>Function Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FUNCTION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionNumber() <em>Function Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer functionNumber = FUNCTION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPCIDeviceID() <em>PCI Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCIDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PCI_DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPCIDeviceID() <em>PCI Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCIDeviceID()
	 * @generated
	 * @ordered
	 */
	protected Integer pciDeviceID = PCI_DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VENDOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected Integer vendorID = VENDOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionID() <em>Revision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REVISION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionID() <em>Revision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionID()
	 * @generated
	 * @ordered
	 */
	protected Integer revisionID = REVISION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PCIDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PCIDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getBaseAddress() {
		if (baseAddress == null) {
			baseAddress = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_PCI_DEVICE__BASE_ADDRESS);
		}
		return baseAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSubsystemID() {
		return subsystemID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsystemID(Integer newSubsystemID) {
		Integer oldSubsystemID = subsystemID;
		subsystemID = newSubsystemID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_DEVICE__SUBSYSTEM_ID, oldSubsystemID, subsystemID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSubsystemVendorID() {
		return subsystemVendorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsystemVendorID(Integer newSubsystemVendorID) {
		Integer oldSubsystemVendorID = subsystemVendorID;
		subsystemVendorID = newSubsystemVendorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_DEVICE__SUBSYSTEM_VENDOR_ID, oldSubsystemVendorID, subsystemVendorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinGrantTime() {
		return minGrantTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinGrantTime(Integer newMinGrantTime) {
		Integer oldMinGrantTime = minGrantTime;
		minGrantTime = newMinGrantTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_DEVICE__MIN_GRANT_TIME, oldMinGrantTime, minGrantTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxLatency() {
		return maxLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLatency(Integer newMaxLatency) {
		Integer oldMaxLatency = maxLatency;
		maxLatency = newMaxLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_DEVICE__MAX_LATENCY, oldMaxLatency, maxLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBusNumber() {
		return busNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusNumber(Integer newBusNumber) {
		Integer oldBusNumber = busNumber;
		busNumber = newBusNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_DEVICE__BUS_NUMBER, oldBusNumber, busNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeviceNumber() {
		return deviceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceNumber(Integer newDeviceNumber) {
		Integer oldDeviceNumber = deviceNumber;
		deviceNumber = newDeviceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_DEVICE__DEVICE_NUMBER, oldDeviceNumber, deviceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFunctionNumber() {
		return functionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionNumber(Integer newFunctionNumber) {
		Integer oldFunctionNumber = functionNumber;
		functionNumber = newFunctionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_DEVICE__FUNCTION_NUMBER, oldFunctionNumber, functionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPCIDeviceID() {
		return pciDeviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPCIDeviceID(Integer newPCIDeviceID) {
		Integer oldPCIDeviceID = pciDeviceID;
		pciDeviceID = newPCIDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_DEVICE__PCI_DEVICE_ID, oldPCIDeviceID, pciDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVendorID() {
		return vendorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorID(Integer newVendorID) {
		Integer oldVendorID = vendorID;
		vendorID = newVendorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_DEVICE__VENDOR_ID, oldVendorID, vendorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRevisionID() {
		return revisionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionID(Integer newRevisionID) {
		Integer oldRevisionID = revisionID;
		revisionID = newRevisionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_DEVICE__REVISION_ID, oldRevisionID, revisionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PCI_DEVICE__BASE_ADDRESS:
				return getBaseAddress();
			case CimPackage.CIM_PCI_DEVICE__SUBSYSTEM_ID:
				return getSubsystemID();
			case CimPackage.CIM_PCI_DEVICE__SUBSYSTEM_VENDOR_ID:
				return getSubsystemVendorID();
			case CimPackage.CIM_PCI_DEVICE__MIN_GRANT_TIME:
				return getMinGrantTime();
			case CimPackage.CIM_PCI_DEVICE__MAX_LATENCY:
				return getMaxLatency();
			case CimPackage.CIM_PCI_DEVICE__BUS_NUMBER:
				return getBusNumber();
			case CimPackage.CIM_PCI_DEVICE__DEVICE_NUMBER:
				return getDeviceNumber();
			case CimPackage.CIM_PCI_DEVICE__FUNCTION_NUMBER:
				return getFunctionNumber();
			case CimPackage.CIM_PCI_DEVICE__PCI_DEVICE_ID:
				return getPCIDeviceID();
			case CimPackage.CIM_PCI_DEVICE__VENDOR_ID:
				return getVendorID();
			case CimPackage.CIM_PCI_DEVICE__REVISION_ID:
				return getRevisionID();
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
			case CimPackage.CIM_PCI_DEVICE__BASE_ADDRESS:
				getBaseAddress().clear();
				getBaseAddress().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_PCI_DEVICE__SUBSYSTEM_ID:
				setSubsystemID((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_DEVICE__SUBSYSTEM_VENDOR_ID:
				setSubsystemVendorID((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_DEVICE__MIN_GRANT_TIME:
				setMinGrantTime((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_DEVICE__MAX_LATENCY:
				setMaxLatency((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_DEVICE__BUS_NUMBER:
				setBusNumber((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_DEVICE__DEVICE_NUMBER:
				setDeviceNumber((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_DEVICE__FUNCTION_NUMBER:
				setFunctionNumber((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_DEVICE__PCI_DEVICE_ID:
				setPCIDeviceID((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_DEVICE__VENDOR_ID:
				setVendorID((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_DEVICE__REVISION_ID:
				setRevisionID((Integer)newValue);
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
			case CimPackage.CIM_PCI_DEVICE__BASE_ADDRESS:
				getBaseAddress().clear();
				return;
			case CimPackage.CIM_PCI_DEVICE__SUBSYSTEM_ID:
				setSubsystemID(SUBSYSTEM_ID_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_DEVICE__SUBSYSTEM_VENDOR_ID:
				setSubsystemVendorID(SUBSYSTEM_VENDOR_ID_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_DEVICE__MIN_GRANT_TIME:
				setMinGrantTime(MIN_GRANT_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_DEVICE__MAX_LATENCY:
				setMaxLatency(MAX_LATENCY_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_DEVICE__BUS_NUMBER:
				setBusNumber(BUS_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_DEVICE__DEVICE_NUMBER:
				setDeviceNumber(DEVICE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_DEVICE__FUNCTION_NUMBER:
				setFunctionNumber(FUNCTION_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_DEVICE__PCI_DEVICE_ID:
				setPCIDeviceID(PCI_DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_DEVICE__VENDOR_ID:
				setVendorID(VENDOR_ID_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_DEVICE__REVISION_ID:
				setRevisionID(REVISION_ID_EDEFAULT);
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
			case CimPackage.CIM_PCI_DEVICE__BASE_ADDRESS:
				return baseAddress != null && !baseAddress.isEmpty();
			case CimPackage.CIM_PCI_DEVICE__SUBSYSTEM_ID:
				return SUBSYSTEM_ID_EDEFAULT == null ? subsystemID != null : !SUBSYSTEM_ID_EDEFAULT.equals(subsystemID);
			case CimPackage.CIM_PCI_DEVICE__SUBSYSTEM_VENDOR_ID:
				return SUBSYSTEM_VENDOR_ID_EDEFAULT == null ? subsystemVendorID != null : !SUBSYSTEM_VENDOR_ID_EDEFAULT.equals(subsystemVendorID);
			case CimPackage.CIM_PCI_DEVICE__MIN_GRANT_TIME:
				return MIN_GRANT_TIME_EDEFAULT == null ? minGrantTime != null : !MIN_GRANT_TIME_EDEFAULT.equals(minGrantTime);
			case CimPackage.CIM_PCI_DEVICE__MAX_LATENCY:
				return MAX_LATENCY_EDEFAULT == null ? maxLatency != null : !MAX_LATENCY_EDEFAULT.equals(maxLatency);
			case CimPackage.CIM_PCI_DEVICE__BUS_NUMBER:
				return BUS_NUMBER_EDEFAULT == null ? busNumber != null : !BUS_NUMBER_EDEFAULT.equals(busNumber);
			case CimPackage.CIM_PCI_DEVICE__DEVICE_NUMBER:
				return DEVICE_NUMBER_EDEFAULT == null ? deviceNumber != null : !DEVICE_NUMBER_EDEFAULT.equals(deviceNumber);
			case CimPackage.CIM_PCI_DEVICE__FUNCTION_NUMBER:
				return FUNCTION_NUMBER_EDEFAULT == null ? functionNumber != null : !FUNCTION_NUMBER_EDEFAULT.equals(functionNumber);
			case CimPackage.CIM_PCI_DEVICE__PCI_DEVICE_ID:
				return PCI_DEVICE_ID_EDEFAULT == null ? pciDeviceID != null : !PCI_DEVICE_ID_EDEFAULT.equals(pciDeviceID);
			case CimPackage.CIM_PCI_DEVICE__VENDOR_ID:
				return VENDOR_ID_EDEFAULT == null ? vendorID != null : !VENDOR_ID_EDEFAULT.equals(vendorID);
			case CimPackage.CIM_PCI_DEVICE__REVISION_ID:
				return REVISION_ID_EDEFAULT == null ? revisionID != null : !REVISION_ID_EDEFAULT.equals(revisionID);
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
		result.append(" (BaseAddress: ");
		result.append(baseAddress);
		result.append(", SubsystemID: ");
		result.append(subsystemID);
		result.append(", SubsystemVendorID: ");
		result.append(subsystemVendorID);
		result.append(", MinGrantTime: ");
		result.append(minGrantTime);
		result.append(", MaxLatency: ");
		result.append(maxLatency);
		result.append(", BusNumber: ");
		result.append(busNumber);
		result.append(", DeviceNumber: ");
		result.append(deviceNumber);
		result.append(", FunctionNumber: ");
		result.append(functionNumber);
		result.append(", PCIDeviceID: ");
		result.append(pciDeviceID);
		result.append(", VendorID: ");
		result.append(vendorID);
		result.append(", RevisionID: ");
		result.append(revisionID);
		result.append(')');
		return result.toString();
	}

} //CIM_PCIDeviceImpl
