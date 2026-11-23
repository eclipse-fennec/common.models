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

import org.dmtf.cim.CIM_SASPHY;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SASPHY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SASPHYImpl#getHardwareMinimumPhysicalLinkRate <em>Hardware Minimum Physical Link Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SASPHYImpl#getHardwareMaximumPhysicalLinkRate <em>Hardware Maximum Physical Link Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SASPHYImpl#getProgrammedMinimumPhysicalLinkRate <em>Programmed Minimum Physical Link Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SASPHYImpl#getProgrammedMaximumPhysicalLinkRate <em>Programmed Maximum Physical Link Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SASPHYImpl#getNegotiatedPhysicalLinkRate <em>Negotiated Physical Link Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SASPHYImpl extends CIM_LogicalDeviceImpl implements CIM_SASPHY {
	/**
	 * The default value of the '{@link #getHardwareMinimumPhysicalLinkRate() <em>Hardware Minimum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareMinimumPhysicalLinkRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long HARDWARE_MINIMUM_PHYSICAL_LINK_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareMinimumPhysicalLinkRate() <em>Hardware Minimum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareMinimumPhysicalLinkRate()
	 * @generated
	 * @ordered
	 */
	protected Long hardwareMinimumPhysicalLinkRate = HARDWARE_MINIMUM_PHYSICAL_LINK_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardwareMaximumPhysicalLinkRate() <em>Hardware Maximum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareMaximumPhysicalLinkRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long HARDWARE_MAXIMUM_PHYSICAL_LINK_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareMaximumPhysicalLinkRate() <em>Hardware Maximum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareMaximumPhysicalLinkRate()
	 * @generated
	 * @ordered
	 */
	protected Long hardwareMaximumPhysicalLinkRate = HARDWARE_MAXIMUM_PHYSICAL_LINK_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgrammedMinimumPhysicalLinkRate() <em>Programmed Minimum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammedMinimumPhysicalLinkRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROGRAMMED_MINIMUM_PHYSICAL_LINK_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgrammedMinimumPhysicalLinkRate() <em>Programmed Minimum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammedMinimumPhysicalLinkRate()
	 * @generated
	 * @ordered
	 */
	protected Long programmedMinimumPhysicalLinkRate = PROGRAMMED_MINIMUM_PHYSICAL_LINK_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgrammedMaximumPhysicalLinkRate() <em>Programmed Maximum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammedMaximumPhysicalLinkRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROGRAMMED_MAXIMUM_PHYSICAL_LINK_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgrammedMaximumPhysicalLinkRate() <em>Programmed Maximum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammedMaximumPhysicalLinkRate()
	 * @generated
	 * @ordered
	 */
	protected Long programmedMaximumPhysicalLinkRate = PROGRAMMED_MAXIMUM_PHYSICAL_LINK_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegotiatedPhysicalLinkRate() <em>Negotiated Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedPhysicalLinkRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long NEGOTIATED_PHYSICAL_LINK_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegotiatedPhysicalLinkRate() <em>Negotiated Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedPhysicalLinkRate()
	 * @generated
	 * @ordered
	 */
	protected Long negotiatedPhysicalLinkRate = NEGOTIATED_PHYSICAL_LINK_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SASPHYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SASPHY();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHardwareMinimumPhysicalLinkRate() {
		return hardwareMinimumPhysicalLinkRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwareMinimumPhysicalLinkRate(Long newHardwareMinimumPhysicalLinkRate) {
		Long oldHardwareMinimumPhysicalLinkRate = hardwareMinimumPhysicalLinkRate;
		hardwareMinimumPhysicalLinkRate = newHardwareMinimumPhysicalLinkRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SASPHY__HARDWARE_MINIMUM_PHYSICAL_LINK_RATE, oldHardwareMinimumPhysicalLinkRate, hardwareMinimumPhysicalLinkRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHardwareMaximumPhysicalLinkRate() {
		return hardwareMaximumPhysicalLinkRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwareMaximumPhysicalLinkRate(Long newHardwareMaximumPhysicalLinkRate) {
		Long oldHardwareMaximumPhysicalLinkRate = hardwareMaximumPhysicalLinkRate;
		hardwareMaximumPhysicalLinkRate = newHardwareMaximumPhysicalLinkRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SASPHY__HARDWARE_MAXIMUM_PHYSICAL_LINK_RATE, oldHardwareMaximumPhysicalLinkRate, hardwareMaximumPhysicalLinkRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getProgrammedMinimumPhysicalLinkRate() {
		return programmedMinimumPhysicalLinkRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammedMinimumPhysicalLinkRate(Long newProgrammedMinimumPhysicalLinkRate) {
		Long oldProgrammedMinimumPhysicalLinkRate = programmedMinimumPhysicalLinkRate;
		programmedMinimumPhysicalLinkRate = newProgrammedMinimumPhysicalLinkRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SASPHY__PROGRAMMED_MINIMUM_PHYSICAL_LINK_RATE, oldProgrammedMinimumPhysicalLinkRate, programmedMinimumPhysicalLinkRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getProgrammedMaximumPhysicalLinkRate() {
		return programmedMaximumPhysicalLinkRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammedMaximumPhysicalLinkRate(Long newProgrammedMaximumPhysicalLinkRate) {
		Long oldProgrammedMaximumPhysicalLinkRate = programmedMaximumPhysicalLinkRate;
		programmedMaximumPhysicalLinkRate = newProgrammedMaximumPhysicalLinkRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SASPHY__PROGRAMMED_MAXIMUM_PHYSICAL_LINK_RATE, oldProgrammedMaximumPhysicalLinkRate, programmedMaximumPhysicalLinkRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNegotiatedPhysicalLinkRate() {
		return negotiatedPhysicalLinkRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegotiatedPhysicalLinkRate(Long newNegotiatedPhysicalLinkRate) {
		Long oldNegotiatedPhysicalLinkRate = negotiatedPhysicalLinkRate;
		negotiatedPhysicalLinkRate = newNegotiatedPhysicalLinkRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SASPHY__NEGOTIATED_PHYSICAL_LINK_RATE, oldNegotiatedPhysicalLinkRate, negotiatedPhysicalLinkRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SASPHY__HARDWARE_MINIMUM_PHYSICAL_LINK_RATE:
				return getHardwareMinimumPhysicalLinkRate();
			case CimPackage.CIM_SASPHY__HARDWARE_MAXIMUM_PHYSICAL_LINK_RATE:
				return getHardwareMaximumPhysicalLinkRate();
			case CimPackage.CIM_SASPHY__PROGRAMMED_MINIMUM_PHYSICAL_LINK_RATE:
				return getProgrammedMinimumPhysicalLinkRate();
			case CimPackage.CIM_SASPHY__PROGRAMMED_MAXIMUM_PHYSICAL_LINK_RATE:
				return getProgrammedMaximumPhysicalLinkRate();
			case CimPackage.CIM_SASPHY__NEGOTIATED_PHYSICAL_LINK_RATE:
				return getNegotiatedPhysicalLinkRate();
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
			case CimPackage.CIM_SASPHY__HARDWARE_MINIMUM_PHYSICAL_LINK_RATE:
				setHardwareMinimumPhysicalLinkRate((Long)newValue);
				return;
			case CimPackage.CIM_SASPHY__HARDWARE_MAXIMUM_PHYSICAL_LINK_RATE:
				setHardwareMaximumPhysicalLinkRate((Long)newValue);
				return;
			case CimPackage.CIM_SASPHY__PROGRAMMED_MINIMUM_PHYSICAL_LINK_RATE:
				setProgrammedMinimumPhysicalLinkRate((Long)newValue);
				return;
			case CimPackage.CIM_SASPHY__PROGRAMMED_MAXIMUM_PHYSICAL_LINK_RATE:
				setProgrammedMaximumPhysicalLinkRate((Long)newValue);
				return;
			case CimPackage.CIM_SASPHY__NEGOTIATED_PHYSICAL_LINK_RATE:
				setNegotiatedPhysicalLinkRate((Long)newValue);
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
			case CimPackage.CIM_SASPHY__HARDWARE_MINIMUM_PHYSICAL_LINK_RATE:
				setHardwareMinimumPhysicalLinkRate(HARDWARE_MINIMUM_PHYSICAL_LINK_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_SASPHY__HARDWARE_MAXIMUM_PHYSICAL_LINK_RATE:
				setHardwareMaximumPhysicalLinkRate(HARDWARE_MAXIMUM_PHYSICAL_LINK_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_SASPHY__PROGRAMMED_MINIMUM_PHYSICAL_LINK_RATE:
				setProgrammedMinimumPhysicalLinkRate(PROGRAMMED_MINIMUM_PHYSICAL_LINK_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_SASPHY__PROGRAMMED_MAXIMUM_PHYSICAL_LINK_RATE:
				setProgrammedMaximumPhysicalLinkRate(PROGRAMMED_MAXIMUM_PHYSICAL_LINK_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_SASPHY__NEGOTIATED_PHYSICAL_LINK_RATE:
				setNegotiatedPhysicalLinkRate(NEGOTIATED_PHYSICAL_LINK_RATE_EDEFAULT);
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
			case CimPackage.CIM_SASPHY__HARDWARE_MINIMUM_PHYSICAL_LINK_RATE:
				return HARDWARE_MINIMUM_PHYSICAL_LINK_RATE_EDEFAULT == null ? hardwareMinimumPhysicalLinkRate != null : !HARDWARE_MINIMUM_PHYSICAL_LINK_RATE_EDEFAULT.equals(hardwareMinimumPhysicalLinkRate);
			case CimPackage.CIM_SASPHY__HARDWARE_MAXIMUM_PHYSICAL_LINK_RATE:
				return HARDWARE_MAXIMUM_PHYSICAL_LINK_RATE_EDEFAULT == null ? hardwareMaximumPhysicalLinkRate != null : !HARDWARE_MAXIMUM_PHYSICAL_LINK_RATE_EDEFAULT.equals(hardwareMaximumPhysicalLinkRate);
			case CimPackage.CIM_SASPHY__PROGRAMMED_MINIMUM_PHYSICAL_LINK_RATE:
				return PROGRAMMED_MINIMUM_PHYSICAL_LINK_RATE_EDEFAULT == null ? programmedMinimumPhysicalLinkRate != null : !PROGRAMMED_MINIMUM_PHYSICAL_LINK_RATE_EDEFAULT.equals(programmedMinimumPhysicalLinkRate);
			case CimPackage.CIM_SASPHY__PROGRAMMED_MAXIMUM_PHYSICAL_LINK_RATE:
				return PROGRAMMED_MAXIMUM_PHYSICAL_LINK_RATE_EDEFAULT == null ? programmedMaximumPhysicalLinkRate != null : !PROGRAMMED_MAXIMUM_PHYSICAL_LINK_RATE_EDEFAULT.equals(programmedMaximumPhysicalLinkRate);
			case CimPackage.CIM_SASPHY__NEGOTIATED_PHYSICAL_LINK_RATE:
				return NEGOTIATED_PHYSICAL_LINK_RATE_EDEFAULT == null ? negotiatedPhysicalLinkRate != null : !NEGOTIATED_PHYSICAL_LINK_RATE_EDEFAULT.equals(negotiatedPhysicalLinkRate);
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
		result.append(" (HardwareMinimumPhysicalLinkRate: ");
		result.append(hardwareMinimumPhysicalLinkRate);
		result.append(", HardwareMaximumPhysicalLinkRate: ");
		result.append(hardwareMaximumPhysicalLinkRate);
		result.append(", ProgrammedMinimumPhysicalLinkRate: ");
		result.append(programmedMinimumPhysicalLinkRate);
		result.append(", ProgrammedMaximumPhysicalLinkRate: ");
		result.append(programmedMaximumPhysicalLinkRate);
		result.append(", NegotiatedPhysicalLinkRate: ");
		result.append(negotiatedPhysicalLinkRate);
		result.append(')');
		return result.toString();
	}

} //CIM_SASPHYImpl
