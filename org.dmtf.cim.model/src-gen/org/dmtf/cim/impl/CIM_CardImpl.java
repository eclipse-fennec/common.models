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

import org.dmtf.cim.CIM_Card;
import org.dmtf.cim.CIM_PhysicalConnector;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CardImpl#getHostingBoard <em>Hosting Board</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CardImpl#getSlotLayout <em>Slot Layout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CardImpl#getRequiresDaughterBoard <em>Requires Daughter Board</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CardImpl#getSpecialRequirements <em>Special Requirements</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CardImpl#getRequirementsDescription <em>Requirements Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CardImpl#getOperatingVoltages <em>Operating Voltages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CardImpl extends CIM_PhysicalPackageImpl implements CIM_Card {
	/**
	 * The default value of the '{@link #getHostingBoard() <em>Hosting Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostingBoard()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HOSTING_BOARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostingBoard() <em>Hosting Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostingBoard()
	 * @generated
	 * @ordered
	 */
	protected Boolean hostingBoard = HOSTING_BOARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlotLayout() <em>Slot Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotLayout()
	 * @generated
	 * @ordered
	 */
	protected static final String SLOT_LAYOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlotLayout() <em>Slot Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotLayout()
	 * @generated
	 * @ordered
	 */
	protected String slotLayout = SLOT_LAYOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiresDaughterBoard() <em>Requires Daughter Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresDaughterBoard()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRES_DAUGHTER_BOARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiresDaughterBoard() <em>Requires Daughter Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresDaughterBoard()
	 * @generated
	 * @ordered
	 */
	protected Boolean requiresDaughterBoard = REQUIRES_DAUGHTER_BOARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecialRequirements() <em>Special Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialRequirements()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SPECIAL_REQUIREMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialRequirements() <em>Special Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialRequirements()
	 * @generated
	 * @ordered
	 */
	protected Boolean specialRequirements = SPECIAL_REQUIREMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequirementsDescription() <em>Requirements Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementsDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREMENTS_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequirementsDescription() <em>Requirements Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementsDescription()
	 * @generated
	 * @ordered
	 */
	protected String requirementsDescription = REQUIREMENTS_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperatingVoltages() <em>Operating Voltages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingVoltages()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> operatingVoltages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Card();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHostingBoard() {
		return hostingBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostingBoard(Boolean newHostingBoard) {
		Boolean oldHostingBoard = hostingBoard;
		hostingBoard = newHostingBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CARD__HOSTING_BOARD, oldHostingBoard, hostingBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSlotLayout() {
		return slotLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlotLayout(String newSlotLayout) {
		String oldSlotLayout = slotLayout;
		slotLayout = newSlotLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CARD__SLOT_LAYOUT, oldSlotLayout, slotLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequiresDaughterBoard() {
		return requiresDaughterBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiresDaughterBoard(Boolean newRequiresDaughterBoard) {
		Boolean oldRequiresDaughterBoard = requiresDaughterBoard;
		requiresDaughterBoard = newRequiresDaughterBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CARD__REQUIRES_DAUGHTER_BOARD, oldRequiresDaughterBoard, requiresDaughterBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSpecialRequirements() {
		return specialRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialRequirements(Boolean newSpecialRequirements) {
		Boolean oldSpecialRequirements = specialRequirements;
		specialRequirements = newSpecialRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CARD__SPECIAL_REQUIREMENTS, oldSpecialRequirements, specialRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequirementsDescription() {
		return requirementsDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementsDescription(String newRequirementsDescription) {
		String oldRequirementsDescription = requirementsDescription;
		requirementsDescription = newRequirementsDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CARD__REQUIREMENTS_DESCRIPTION, oldRequirementsDescription, requirementsDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getOperatingVoltages() {
		if (operatingVoltages == null) {
			operatingVoltages = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CARD__OPERATING_VOLTAGES);
		}
		return operatingVoltages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ConnectorPower(CIM_PhysicalConnector Connector, Boolean PoweredOn) {
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
			case CimPackage.CIM_CARD__HOSTING_BOARD:
				return getHostingBoard();
			case CimPackage.CIM_CARD__SLOT_LAYOUT:
				return getSlotLayout();
			case CimPackage.CIM_CARD__REQUIRES_DAUGHTER_BOARD:
				return getRequiresDaughterBoard();
			case CimPackage.CIM_CARD__SPECIAL_REQUIREMENTS:
				return getSpecialRequirements();
			case CimPackage.CIM_CARD__REQUIREMENTS_DESCRIPTION:
				return getRequirementsDescription();
			case CimPackage.CIM_CARD__OPERATING_VOLTAGES:
				return getOperatingVoltages();
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
			case CimPackage.CIM_CARD__HOSTING_BOARD:
				setHostingBoard((Boolean)newValue);
				return;
			case CimPackage.CIM_CARD__SLOT_LAYOUT:
				setSlotLayout((String)newValue);
				return;
			case CimPackage.CIM_CARD__REQUIRES_DAUGHTER_BOARD:
				setRequiresDaughterBoard((Boolean)newValue);
				return;
			case CimPackage.CIM_CARD__SPECIAL_REQUIREMENTS:
				setSpecialRequirements((Boolean)newValue);
				return;
			case CimPackage.CIM_CARD__REQUIREMENTS_DESCRIPTION:
				setRequirementsDescription((String)newValue);
				return;
			case CimPackage.CIM_CARD__OPERATING_VOLTAGES:
				getOperatingVoltages().clear();
				getOperatingVoltages().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_CARD__HOSTING_BOARD:
				setHostingBoard(HOSTING_BOARD_EDEFAULT);
				return;
			case CimPackage.CIM_CARD__SLOT_LAYOUT:
				setSlotLayout(SLOT_LAYOUT_EDEFAULT);
				return;
			case CimPackage.CIM_CARD__REQUIRES_DAUGHTER_BOARD:
				setRequiresDaughterBoard(REQUIRES_DAUGHTER_BOARD_EDEFAULT);
				return;
			case CimPackage.CIM_CARD__SPECIAL_REQUIREMENTS:
				setSpecialRequirements(SPECIAL_REQUIREMENTS_EDEFAULT);
				return;
			case CimPackage.CIM_CARD__REQUIREMENTS_DESCRIPTION:
				setRequirementsDescription(REQUIREMENTS_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_CARD__OPERATING_VOLTAGES:
				getOperatingVoltages().clear();
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
			case CimPackage.CIM_CARD__HOSTING_BOARD:
				return HOSTING_BOARD_EDEFAULT == null ? hostingBoard != null : !HOSTING_BOARD_EDEFAULT.equals(hostingBoard);
			case CimPackage.CIM_CARD__SLOT_LAYOUT:
				return SLOT_LAYOUT_EDEFAULT == null ? slotLayout != null : !SLOT_LAYOUT_EDEFAULT.equals(slotLayout);
			case CimPackage.CIM_CARD__REQUIRES_DAUGHTER_BOARD:
				return REQUIRES_DAUGHTER_BOARD_EDEFAULT == null ? requiresDaughterBoard != null : !REQUIRES_DAUGHTER_BOARD_EDEFAULT.equals(requiresDaughterBoard);
			case CimPackage.CIM_CARD__SPECIAL_REQUIREMENTS:
				return SPECIAL_REQUIREMENTS_EDEFAULT == null ? specialRequirements != null : !SPECIAL_REQUIREMENTS_EDEFAULT.equals(specialRequirements);
			case CimPackage.CIM_CARD__REQUIREMENTS_DESCRIPTION:
				return REQUIREMENTS_DESCRIPTION_EDEFAULT == null ? requirementsDescription != null : !REQUIREMENTS_DESCRIPTION_EDEFAULT.equals(requirementsDescription);
			case CimPackage.CIM_CARD__OPERATING_VOLTAGES:
				return operatingVoltages != null && !operatingVoltages.isEmpty();
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
			case CimPackage.CIM_CARD___CONNECTOR_POWER__CIM_PHYSICALCONNECTOR_BOOLEAN:
				return ConnectorPower((CIM_PhysicalConnector)arguments.get(0), (Boolean)arguments.get(1));
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
		result.append(" (HostingBoard: ");
		result.append(hostingBoard);
		result.append(", SlotLayout: ");
		result.append(slotLayout);
		result.append(", RequiresDaughterBoard: ");
		result.append(requiresDaughterBoard);
		result.append(", SpecialRequirements: ");
		result.append(specialRequirements);
		result.append(", RequirementsDescription: ");
		result.append(requirementsDescription);
		result.append(", OperatingVoltages: ");
		result.append(operatingVoltages);
		result.append(')');
		return result.toString();
	}

} //CIM_CardImpl
