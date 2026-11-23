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

import org.dmtf.cim.CIM_IPSubinterface;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IP Subinterface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPSubinterfaceImpl#getEncapsulationType <em>Encapsulation Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPSubinterfaceImpl#getParentInterface <em>Parent Interface</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPSubinterfaceImpl#getEncapsulationValue <em>Encapsulation Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPSubinterfaceImpl#getOtherEncapsulationType <em>Other Encapsulation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPSubinterfaceImpl extends CIM_IPProtocolEndpointImpl implements CIM_IPSubinterface {
	/**
	 * The default value of the '{@link #getEncapsulationType() <em>Encapsulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulationType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENCAPSULATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncapsulationType() <em>Encapsulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulationType()
	 * @generated
	 * @ordered
	 */
	protected Integer encapsulationType = ENCAPSULATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentInterface() <em>Parent Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentInterface() <em>Parent Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentInterface()
	 * @generated
	 * @ordered
	 */
	protected String parentInterface = PARENT_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncapsulationValue() <em>Encapsulation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulationValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCAPSULATION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncapsulationValue() <em>Encapsulation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulationValue()
	 * @generated
	 * @ordered
	 */
	protected String encapsulationValue = ENCAPSULATION_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEncapsulationType() <em>Other Encapsulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEncapsulationType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENCAPSULATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEncapsulationType() <em>Other Encapsulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEncapsulationType()
	 * @generated
	 * @ordered
	 */
	protected String otherEncapsulationType = OTHER_ENCAPSULATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPSubinterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPSubinterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEncapsulationType() {
		return encapsulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncapsulationType(Integer newEncapsulationType) {
		Integer oldEncapsulationType = encapsulationType;
		encapsulationType = newEncapsulationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_SUBINTERFACE__ENCAPSULATION_TYPE, oldEncapsulationType, encapsulationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentInterface() {
		return parentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentInterface(String newParentInterface) {
		String oldParentInterface = parentInterface;
		parentInterface = newParentInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_SUBINTERFACE__PARENT_INTERFACE, oldParentInterface, parentInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncapsulationValue() {
		return encapsulationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncapsulationValue(String newEncapsulationValue) {
		String oldEncapsulationValue = encapsulationValue;
		encapsulationValue = newEncapsulationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_SUBINTERFACE__ENCAPSULATION_VALUE, oldEncapsulationValue, encapsulationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEncapsulationType() {
		return otherEncapsulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEncapsulationType(String newOtherEncapsulationType) {
		String oldOtherEncapsulationType = otherEncapsulationType;
		otherEncapsulationType = newOtherEncapsulationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_SUBINTERFACE__OTHER_ENCAPSULATION_TYPE, oldOtherEncapsulationType, otherEncapsulationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IP_SUBINTERFACE__ENCAPSULATION_TYPE:
				return getEncapsulationType();
			case CimPackage.CIM_IP_SUBINTERFACE__PARENT_INTERFACE:
				return getParentInterface();
			case CimPackage.CIM_IP_SUBINTERFACE__ENCAPSULATION_VALUE:
				return getEncapsulationValue();
			case CimPackage.CIM_IP_SUBINTERFACE__OTHER_ENCAPSULATION_TYPE:
				return getOtherEncapsulationType();
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
			case CimPackage.CIM_IP_SUBINTERFACE__ENCAPSULATION_TYPE:
				setEncapsulationType((Integer)newValue);
				return;
			case CimPackage.CIM_IP_SUBINTERFACE__PARENT_INTERFACE:
				setParentInterface((String)newValue);
				return;
			case CimPackage.CIM_IP_SUBINTERFACE__ENCAPSULATION_VALUE:
				setEncapsulationValue((String)newValue);
				return;
			case CimPackage.CIM_IP_SUBINTERFACE__OTHER_ENCAPSULATION_TYPE:
				setOtherEncapsulationType((String)newValue);
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
			case CimPackage.CIM_IP_SUBINTERFACE__ENCAPSULATION_TYPE:
				setEncapsulationType(ENCAPSULATION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_IP_SUBINTERFACE__PARENT_INTERFACE:
				setParentInterface(PARENT_INTERFACE_EDEFAULT);
				return;
			case CimPackage.CIM_IP_SUBINTERFACE__ENCAPSULATION_VALUE:
				setEncapsulationValue(ENCAPSULATION_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_IP_SUBINTERFACE__OTHER_ENCAPSULATION_TYPE:
				setOtherEncapsulationType(OTHER_ENCAPSULATION_TYPE_EDEFAULT);
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
			case CimPackage.CIM_IP_SUBINTERFACE__ENCAPSULATION_TYPE:
				return ENCAPSULATION_TYPE_EDEFAULT == null ? encapsulationType != null : !ENCAPSULATION_TYPE_EDEFAULT.equals(encapsulationType);
			case CimPackage.CIM_IP_SUBINTERFACE__PARENT_INTERFACE:
				return PARENT_INTERFACE_EDEFAULT == null ? parentInterface != null : !PARENT_INTERFACE_EDEFAULT.equals(parentInterface);
			case CimPackage.CIM_IP_SUBINTERFACE__ENCAPSULATION_VALUE:
				return ENCAPSULATION_VALUE_EDEFAULT == null ? encapsulationValue != null : !ENCAPSULATION_VALUE_EDEFAULT.equals(encapsulationValue);
			case CimPackage.CIM_IP_SUBINTERFACE__OTHER_ENCAPSULATION_TYPE:
				return OTHER_ENCAPSULATION_TYPE_EDEFAULT == null ? otherEncapsulationType != null : !OTHER_ENCAPSULATION_TYPE_EDEFAULT.equals(otherEncapsulationType);
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
		result.append(" (EncapsulationType: ");
		result.append(encapsulationType);
		result.append(", ParentInterface: ");
		result.append(parentInterface);
		result.append(", EncapsulationValue: ");
		result.append(encapsulationValue);
		result.append(", OtherEncapsulationType: ");
		result.append(otherEncapsulationType);
		result.append(')');
		return result.toString();
	}

} //CIM_IPSubinterfaceImpl
