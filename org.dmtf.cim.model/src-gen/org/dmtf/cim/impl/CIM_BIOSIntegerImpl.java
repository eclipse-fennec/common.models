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

import org.dmtf.cim.CIM_BIOSInteger;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BIOS Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSIntegerImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSIntegerImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSIntegerImpl#getProgrammaticUnit <em>Programmatic Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSIntegerImpl#getScalarIncrement <em>Scalar Increment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BIOSIntegerImpl extends CIM_BIOSAttributeImpl implements CIM_BIOSInteger {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Long lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Long upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgrammaticUnit() <em>Programmatic Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammaticUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAMMATIC_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgrammaticUnit() <em>Programmatic Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammaticUnit()
	 * @generated
	 * @ordered
	 */
	protected String programmaticUnit = PROGRAMMATIC_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalarIncrement() <em>Scalar Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final Long SCALAR_INCREMENT_EDEFAULT = Long.valueOf(1L);

	/**
	 * The cached value of the '{@link #getScalarIncrement() <em>Scalar Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarIncrement()
	 * @generated
	 * @ordered
	 */
	protected Long scalarIncrement = SCALAR_INCREMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BIOSIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BIOSInteger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(Long newLowerBound) {
		Long oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_INTEGER__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(Long newUpperBound) {
		Long oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_INTEGER__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProgrammaticUnit() {
		return programmaticUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammaticUnit(String newProgrammaticUnit) {
		String oldProgrammaticUnit = programmaticUnit;
		programmaticUnit = newProgrammaticUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_INTEGER__PROGRAMMATIC_UNIT, oldProgrammaticUnit, programmaticUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getScalarIncrement() {
		return scalarIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalarIncrement(Long newScalarIncrement) {
		Long oldScalarIncrement = scalarIncrement;
		scalarIncrement = newScalarIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BIOS_INTEGER__SCALAR_INCREMENT, oldScalarIncrement, scalarIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BIOS_INTEGER__LOWER_BOUND:
				return getLowerBound();
			case CimPackage.CIM_BIOS_INTEGER__UPPER_BOUND:
				return getUpperBound();
			case CimPackage.CIM_BIOS_INTEGER__PROGRAMMATIC_UNIT:
				return getProgrammaticUnit();
			case CimPackage.CIM_BIOS_INTEGER__SCALAR_INCREMENT:
				return getScalarIncrement();
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
			case CimPackage.CIM_BIOS_INTEGER__LOWER_BOUND:
				setLowerBound((Long)newValue);
				return;
			case CimPackage.CIM_BIOS_INTEGER__UPPER_BOUND:
				setUpperBound((Long)newValue);
				return;
			case CimPackage.CIM_BIOS_INTEGER__PROGRAMMATIC_UNIT:
				setProgrammaticUnit((String)newValue);
				return;
			case CimPackage.CIM_BIOS_INTEGER__SCALAR_INCREMENT:
				setScalarIncrement((Long)newValue);
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
			case CimPackage.CIM_BIOS_INTEGER__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_INTEGER__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_INTEGER__PROGRAMMATIC_UNIT:
				setProgrammaticUnit(PROGRAMMATIC_UNIT_EDEFAULT);
				return;
			case CimPackage.CIM_BIOS_INTEGER__SCALAR_INCREMENT:
				setScalarIncrement(SCALAR_INCREMENT_EDEFAULT);
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
			case CimPackage.CIM_BIOS_INTEGER__LOWER_BOUND:
				return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
			case CimPackage.CIM_BIOS_INTEGER__UPPER_BOUND:
				return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
			case CimPackage.CIM_BIOS_INTEGER__PROGRAMMATIC_UNIT:
				return PROGRAMMATIC_UNIT_EDEFAULT == null ? programmaticUnit != null : !PROGRAMMATIC_UNIT_EDEFAULT.equals(programmaticUnit);
			case CimPackage.CIM_BIOS_INTEGER__SCALAR_INCREMENT:
				return SCALAR_INCREMENT_EDEFAULT == null ? scalarIncrement != null : !SCALAR_INCREMENT_EDEFAULT.equals(scalarIncrement);
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
		result.append(" (LowerBound: ");
		result.append(lowerBound);
		result.append(", UpperBound: ");
		result.append(upperBound);
		result.append(", ProgrammaticUnit: ");
		result.append(programmaticUnit);
		result.append(", ScalarIncrement: ");
		result.append(scalarIncrement);
		result.append(')');
		return result.toString();
	}

} //CIM_BIOSIntegerImpl
