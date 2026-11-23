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

import org.dmtf.cim.CIM_PhysicalConnector;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalConnectorImpl#getConnectorPinout <em>Connector Pinout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalConnectorImpl#getConnectorType <em>Connector Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalConnectorImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalConnectorImpl#getConnectorGender <em>Connector Gender</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalConnectorImpl#getConnectorElectricalCharacteristics <em>Connector Electrical Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalConnectorImpl#getOtherElectricalCharacteristics <em>Other Electrical Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalConnectorImpl#getNumPhysicalPins <em>Num Physical Pins</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalConnectorImpl#getConnectorLayout <em>Connector Layout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalConnectorImpl#getConnectorDescription <em>Connector Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalConnectorImpl extends CIM_PhysicalElementImpl implements CIM_PhysicalConnector {
	/**
	 * The default value of the '{@link #getConnectorPinout() <em>Connector Pinout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorPinout()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_PINOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorPinout() <em>Connector Pinout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorPinout()
	 * @generated
	 * @ordered
	 */
	protected String connectorPinout = CONNECTOR_PINOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectorType() <em>Connector Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> connectorType;

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
	 * The default value of the '{@link #getConnectorGender() <em>Connector Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorGender()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONNECTOR_GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorGender() <em>Connector Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorGender()
	 * @generated
	 * @ordered
	 */
	protected Integer connectorGender = CONNECTOR_GENDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectorElectricalCharacteristics() <em>Connector Electrical Characteristics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorElectricalCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> connectorElectricalCharacteristics;

	/**
	 * The cached value of the '{@link #getOtherElectricalCharacteristics() <em>Other Electrical Characteristics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherElectricalCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherElectricalCharacteristics;

	/**
	 * The default value of the '{@link #getNumPhysicalPins() <em>Num Physical Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPhysicalPins()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUM_PHYSICAL_PINS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumPhysicalPins() <em>Num Physical Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPhysicalPins()
	 * @generated
	 * @ordered
	 */
	protected Long numPhysicalPins = NUM_PHYSICAL_PINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectorLayout() <em>Connector Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorLayout()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONNECTOR_LAYOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorLayout() <em>Connector Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorLayout()
	 * @generated
	 * @ordered
	 */
	protected Integer connectorLayout = CONNECTOR_LAYOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectorDescription() <em>Connector Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorDescription() <em>Connector Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorDescription()
	 * @generated
	 * @ordered
	 */
	protected String connectorDescription = CONNECTOR_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalConnector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectorPinout() {
		return connectorPinout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorPinout(String newConnectorPinout) {
		String oldConnectorPinout = connectorPinout;
		connectorPinout = newConnectorPinout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_PINOUT, oldConnectorPinout, connectorPinout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getConnectorType() {
		if (connectorType == null) {
			connectorType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_TYPE);
		}
		return connectorType;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_CONNECTOR__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConnectorGender() {
		return connectorGender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorGender(Integer newConnectorGender) {
		Integer oldConnectorGender = connectorGender;
		connectorGender = newConnectorGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_GENDER, oldConnectorGender, connectorGender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getConnectorElectricalCharacteristics() {
		if (connectorElectricalCharacteristics == null) {
			connectorElectricalCharacteristics = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_ELECTRICAL_CHARACTERISTICS);
		}
		return connectorElectricalCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherElectricalCharacteristics() {
		if (otherElectricalCharacteristics == null) {
			otherElectricalCharacteristics = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_CONNECTOR__OTHER_ELECTRICAL_CHARACTERISTICS);
		}
		return otherElectricalCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumPhysicalPins() {
		return numPhysicalPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumPhysicalPins(Long newNumPhysicalPins) {
		Long oldNumPhysicalPins = numPhysicalPins;
		numPhysicalPins = newNumPhysicalPins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_CONNECTOR__NUM_PHYSICAL_PINS, oldNumPhysicalPins, numPhysicalPins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConnectorLayout() {
		return connectorLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorLayout(Integer newConnectorLayout) {
		Integer oldConnectorLayout = connectorLayout;
		connectorLayout = newConnectorLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_LAYOUT, oldConnectorLayout, connectorLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectorDescription() {
		return connectorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectorDescription(String newConnectorDescription) {
		String oldConnectorDescription = connectorDescription;
		connectorDescription = newConnectorDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_DESCRIPTION, oldConnectorDescription, connectorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_PINOUT:
				return getConnectorPinout();
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_TYPE:
				return getConnectorType();
			case CimPackage.CIM_PHYSICAL_CONNECTOR__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_GENDER:
				return getConnectorGender();
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_ELECTRICAL_CHARACTERISTICS:
				return getConnectorElectricalCharacteristics();
			case CimPackage.CIM_PHYSICAL_CONNECTOR__OTHER_ELECTRICAL_CHARACTERISTICS:
				return getOtherElectricalCharacteristics();
			case CimPackage.CIM_PHYSICAL_CONNECTOR__NUM_PHYSICAL_PINS:
				return getNumPhysicalPins();
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_LAYOUT:
				return getConnectorLayout();
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_DESCRIPTION:
				return getConnectorDescription();
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
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_PINOUT:
				setConnectorPinout((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_TYPE:
				getConnectorType().clear();
				getConnectorType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_GENDER:
				setConnectorGender((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_ELECTRICAL_CHARACTERISTICS:
				getConnectorElectricalCharacteristics().clear();
				getConnectorElectricalCharacteristics().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__OTHER_ELECTRICAL_CHARACTERISTICS:
				getOtherElectricalCharacteristics().clear();
				getOtherElectricalCharacteristics().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__NUM_PHYSICAL_PINS:
				setNumPhysicalPins((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_LAYOUT:
				setConnectorLayout((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_DESCRIPTION:
				setConnectorDescription((String)newValue);
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
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_PINOUT:
				setConnectorPinout(CONNECTOR_PINOUT_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_TYPE:
				getConnectorType().clear();
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_GENDER:
				setConnectorGender(CONNECTOR_GENDER_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_ELECTRICAL_CHARACTERISTICS:
				getConnectorElectricalCharacteristics().clear();
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__OTHER_ELECTRICAL_CHARACTERISTICS:
				getOtherElectricalCharacteristics().clear();
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__NUM_PHYSICAL_PINS:
				setNumPhysicalPins(NUM_PHYSICAL_PINS_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_LAYOUT:
				setConnectorLayout(CONNECTOR_LAYOUT_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_DESCRIPTION:
				setConnectorDescription(CONNECTOR_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_PINOUT:
				return CONNECTOR_PINOUT_EDEFAULT == null ? connectorPinout != null : !CONNECTOR_PINOUT_EDEFAULT.equals(connectorPinout);
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_TYPE:
				return connectorType != null && !connectorType.isEmpty();
			case CimPackage.CIM_PHYSICAL_CONNECTOR__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_GENDER:
				return CONNECTOR_GENDER_EDEFAULT == null ? connectorGender != null : !CONNECTOR_GENDER_EDEFAULT.equals(connectorGender);
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_ELECTRICAL_CHARACTERISTICS:
				return connectorElectricalCharacteristics != null && !connectorElectricalCharacteristics.isEmpty();
			case CimPackage.CIM_PHYSICAL_CONNECTOR__OTHER_ELECTRICAL_CHARACTERISTICS:
				return otherElectricalCharacteristics != null && !otherElectricalCharacteristics.isEmpty();
			case CimPackage.CIM_PHYSICAL_CONNECTOR__NUM_PHYSICAL_PINS:
				return NUM_PHYSICAL_PINS_EDEFAULT == null ? numPhysicalPins != null : !NUM_PHYSICAL_PINS_EDEFAULT.equals(numPhysicalPins);
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_LAYOUT:
				return CONNECTOR_LAYOUT_EDEFAULT == null ? connectorLayout != null : !CONNECTOR_LAYOUT_EDEFAULT.equals(connectorLayout);
			case CimPackage.CIM_PHYSICAL_CONNECTOR__CONNECTOR_DESCRIPTION:
				return CONNECTOR_DESCRIPTION_EDEFAULT == null ? connectorDescription != null : !CONNECTOR_DESCRIPTION_EDEFAULT.equals(connectorDescription);
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
		result.append(" (ConnectorPinout: ");
		result.append(connectorPinout);
		result.append(", ConnectorType: ");
		result.append(connectorType);
		result.append(", OtherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(", ConnectorGender: ");
		result.append(connectorGender);
		result.append(", ConnectorElectricalCharacteristics: ");
		result.append(connectorElectricalCharacteristics);
		result.append(", OtherElectricalCharacteristics: ");
		result.append(otherElectricalCharacteristics);
		result.append(", NumPhysicalPins: ");
		result.append(numPhysicalPins);
		result.append(", ConnectorLayout: ");
		result.append(connectorLayout);
		result.append(", ConnectorDescription: ");
		result.append(connectorDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalConnectorImpl
