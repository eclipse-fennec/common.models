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

import org.dmtf.cim.CIM_IRQ;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IRQ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IRQImpl#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IRQImpl#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IRQImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IRQImpl#getIRQNumber <em>IRQ Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IRQImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IRQImpl#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IRQImpl#getTriggerLevel <em>Trigger Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IRQImpl#getHardware <em>Hardware</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IRQImpl extends CIM_SystemResourceImpl implements CIM_IRQ {
	/**
	 * The default value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSCreationClassName() <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String csCreationClassName = CS_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected static final String CS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSName() <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSName()
	 * @generated
	 * @ordered
	 */
	protected String csName = CS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIRQNumber() <em>IRQ Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRQNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long IRQ_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIRQNumber() <em>IRQ Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRQNumber()
	 * @generated
	 * @ordered
	 */
	protected Long irqNumber = IRQ_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AVAILABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected Integer availability = AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRIGGER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected Integer triggerType = TRIGGER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerLevel() <em>Trigger Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRIGGER_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerLevel() <em>Trigger Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerLevel()
	 * @generated
	 * @ordered
	 */
	protected Integer triggerLevel = TRIGGER_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HARDWARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected Boolean hardware = HARDWARE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IRQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IRQ();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCSCreationClassName() {
		return csCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCSCreationClassName(String newCSCreationClassName) {
		String oldCSCreationClassName = csCreationClassName;
		csCreationClassName = newCSCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IRQ__CS_CREATION_CLASS_NAME, oldCSCreationClassName, csCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCSName() {
		return csName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCSName(String newCSName) {
		String oldCSName = csName;
		csName = newCSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IRQ__CS_NAME, oldCSName, csName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IRQ__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIRQNumber() {
		return irqNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIRQNumber(Long newIRQNumber) {
		Long oldIRQNumber = irqNumber;
		irqNumber = newIRQNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IRQ__IRQ_NUMBER, oldIRQNumber, irqNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailability(Integer newAvailability) {
		Integer oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IRQ__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTriggerType() {
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerType(Integer newTriggerType) {
		Integer oldTriggerType = triggerType;
		triggerType = newTriggerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IRQ__TRIGGER_TYPE, oldTriggerType, triggerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTriggerLevel() {
		return triggerLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerLevel(Integer newTriggerLevel) {
		Integer oldTriggerLevel = triggerLevel;
		triggerLevel = newTriggerLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IRQ__TRIGGER_LEVEL, oldTriggerLevel, triggerLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHardware() {
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardware(Boolean newHardware) {
		Boolean oldHardware = hardware;
		hardware = newHardware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IRQ__HARDWARE, oldHardware, hardware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IRQ__CS_CREATION_CLASS_NAME:
				return getCSCreationClassName();
			case CimPackage.CIM_IRQ__CS_NAME:
				return getCSName();
			case CimPackage.CIM_IRQ__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_IRQ__IRQ_NUMBER:
				return getIRQNumber();
			case CimPackage.CIM_IRQ__AVAILABILITY:
				return getAvailability();
			case CimPackage.CIM_IRQ__TRIGGER_TYPE:
				return getTriggerType();
			case CimPackage.CIM_IRQ__TRIGGER_LEVEL:
				return getTriggerLevel();
			case CimPackage.CIM_IRQ__HARDWARE:
				return getHardware();
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
			case CimPackage.CIM_IRQ__CS_CREATION_CLASS_NAME:
				setCSCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_IRQ__CS_NAME:
				setCSName((String)newValue);
				return;
			case CimPackage.CIM_IRQ__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_IRQ__IRQ_NUMBER:
				setIRQNumber((Long)newValue);
				return;
			case CimPackage.CIM_IRQ__AVAILABILITY:
				setAvailability((Integer)newValue);
				return;
			case CimPackage.CIM_IRQ__TRIGGER_TYPE:
				setTriggerType((Integer)newValue);
				return;
			case CimPackage.CIM_IRQ__TRIGGER_LEVEL:
				setTriggerLevel((Integer)newValue);
				return;
			case CimPackage.CIM_IRQ__HARDWARE:
				setHardware((Boolean)newValue);
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
			case CimPackage.CIM_IRQ__CS_CREATION_CLASS_NAME:
				setCSCreationClassName(CS_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_IRQ__CS_NAME:
				setCSName(CS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_IRQ__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_IRQ__IRQ_NUMBER:
				setIRQNumber(IRQ_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_IRQ__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case CimPackage.CIM_IRQ__TRIGGER_TYPE:
				setTriggerType(TRIGGER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_IRQ__TRIGGER_LEVEL:
				setTriggerLevel(TRIGGER_LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_IRQ__HARDWARE:
				setHardware(HARDWARE_EDEFAULT);
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
			case CimPackage.CIM_IRQ__CS_CREATION_CLASS_NAME:
				return CS_CREATION_CLASS_NAME_EDEFAULT == null ? csCreationClassName != null : !CS_CREATION_CLASS_NAME_EDEFAULT.equals(csCreationClassName);
			case CimPackage.CIM_IRQ__CS_NAME:
				return CS_NAME_EDEFAULT == null ? csName != null : !CS_NAME_EDEFAULT.equals(csName);
			case CimPackage.CIM_IRQ__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_IRQ__IRQ_NUMBER:
				return IRQ_NUMBER_EDEFAULT == null ? irqNumber != null : !IRQ_NUMBER_EDEFAULT.equals(irqNumber);
			case CimPackage.CIM_IRQ__AVAILABILITY:
				return AVAILABILITY_EDEFAULT == null ? availability != null : !AVAILABILITY_EDEFAULT.equals(availability);
			case CimPackage.CIM_IRQ__TRIGGER_TYPE:
				return TRIGGER_TYPE_EDEFAULT == null ? triggerType != null : !TRIGGER_TYPE_EDEFAULT.equals(triggerType);
			case CimPackage.CIM_IRQ__TRIGGER_LEVEL:
				return TRIGGER_LEVEL_EDEFAULT == null ? triggerLevel != null : !TRIGGER_LEVEL_EDEFAULT.equals(triggerLevel);
			case CimPackage.CIM_IRQ__HARDWARE:
				return HARDWARE_EDEFAULT == null ? hardware != null : !HARDWARE_EDEFAULT.equals(hardware);
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
		result.append(" (CSCreationClassName: ");
		result.append(csCreationClassName);
		result.append(", CSName: ");
		result.append(csName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", IRQNumber: ");
		result.append(irqNumber);
		result.append(", Availability: ");
		result.append(availability);
		result.append(", TriggerType: ");
		result.append(triggerType);
		result.append(", TriggerLevel: ");
		result.append(triggerLevel);
		result.append(", Hardware: ");
		result.append(hardware);
		result.append(')');
		return result.toString();
	}

} //CIM_IRQImpl
