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

import org.dmtf.cim.CIM_FCPort;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FC Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortImpl#getSupportedCOS <em>Supported COS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortImpl#getActiveCOS <em>Active COS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortImpl#getSupportedFC4Types <em>Supported FC4 Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortImpl#getActiveFC4Types <em>Active FC4 Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortImpl#getDetailedPortState <em>Detailed Port State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortImpl#getDomainPortNumber <em>Domain Port Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortImpl#getLogicalModulePortNumber <em>Logical Module Port Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortImpl#getPortAvailability <em>Port Availability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortImpl#getPortDiscriminator <em>Port Discriminator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FCPortImpl extends CIM_NetworkPortImpl implements CIM_FCPort {
	/**
	 * The cached value of the '{@link #getSupportedCOS() <em>Supported COS</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCOS()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedCOS;

	/**
	 * The cached value of the '{@link #getActiveCOS() <em>Active COS</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveCOS()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> activeCOS;

	/**
	 * The cached value of the '{@link #getSupportedFC4Types() <em>Supported FC4 Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFC4Types()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedFC4Types;

	/**
	 * The cached value of the '{@link #getActiveFC4Types() <em>Active FC4 Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveFC4Types()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> activeFC4Types;

	/**
	 * The default value of the '{@link #getDetailedPortState() <em>Detailed Port State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedPortState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DETAILED_PORT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailedPortState() <em>Detailed Port State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedPortState()
	 * @generated
	 * @ordered
	 */
	protected Integer detailedPortState = DETAILED_PORT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainPortNumber() <em>Domain Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DOMAIN_PORT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainPortNumber() <em>Domain Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainPortNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer domainPortNumber = DOMAIN_PORT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalModulePortNumber() <em>Logical Module Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalModulePortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOGICAL_MODULE_PORT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalModulePortNumber() <em>Logical Module Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalModulePortNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer logicalModulePortNumber = LOGICAL_MODULE_PORT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortAvailability() <em>Port Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_AVAILABILITY_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getPortAvailability() <em>Port Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortAvailability()
	 * @generated
	 * @ordered
	 */
	protected Integer portAvailability = PORT_AVAILABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortDiscriminator() <em>Port Discriminator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> portDiscriminator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FCPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FCPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedCOS() {
		if (supportedCOS == null) {
			supportedCOS = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FC_PORT__SUPPORTED_COS);
		}
		return supportedCOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getActiveCOS() {
		if (activeCOS == null) {
			activeCOS = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FC_PORT__ACTIVE_COS);
		}
		return activeCOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedFC4Types() {
		if (supportedFC4Types == null) {
			supportedFC4Types = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FC_PORT__SUPPORTED_FC4_TYPES);
		}
		return supportedFC4Types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getActiveFC4Types() {
		if (activeFC4Types == null) {
			activeFC4Types = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FC_PORT__ACTIVE_FC4_TYPES);
		}
		return activeFC4Types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDetailedPortState() {
		return detailedPortState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailedPortState(Integer newDetailedPortState) {
		Integer oldDetailedPortState = detailedPortState;
		detailedPortState = newDetailedPortState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT__DETAILED_PORT_STATE, oldDetailedPortState, detailedPortState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDomainPortNumber() {
		return domainPortNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainPortNumber(Integer newDomainPortNumber) {
		Integer oldDomainPortNumber = domainPortNumber;
		domainPortNumber = newDomainPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT__DOMAIN_PORT_NUMBER, oldDomainPortNumber, domainPortNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLogicalModulePortNumber() {
		return logicalModulePortNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalModulePortNumber(Integer newLogicalModulePortNumber) {
		Integer oldLogicalModulePortNumber = logicalModulePortNumber;
		logicalModulePortNumber = newLogicalModulePortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT__LOGICAL_MODULE_PORT_NUMBER, oldLogicalModulePortNumber, logicalModulePortNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPortAvailability() {
		return portAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortAvailability(Integer newPortAvailability) {
		Integer oldPortAvailability = portAvailability;
		portAvailability = newPortAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT__PORT_AVAILABILITY, oldPortAvailability, portAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPortDiscriminator() {
		if (portDiscriminator == null) {
			portDiscriminator = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FC_PORT__PORT_DISCRIMINATOR);
		}
		return portDiscriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long Decommission(Boolean Force, EList<String> Messages) {
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
	public Long Recommission(EList<String> Messages) {
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
			case CimPackage.CIM_FC_PORT__SUPPORTED_COS:
				return getSupportedCOS();
			case CimPackage.CIM_FC_PORT__ACTIVE_COS:
				return getActiveCOS();
			case CimPackage.CIM_FC_PORT__SUPPORTED_FC4_TYPES:
				return getSupportedFC4Types();
			case CimPackage.CIM_FC_PORT__ACTIVE_FC4_TYPES:
				return getActiveFC4Types();
			case CimPackage.CIM_FC_PORT__DETAILED_PORT_STATE:
				return getDetailedPortState();
			case CimPackage.CIM_FC_PORT__DOMAIN_PORT_NUMBER:
				return getDomainPortNumber();
			case CimPackage.CIM_FC_PORT__LOGICAL_MODULE_PORT_NUMBER:
				return getLogicalModulePortNumber();
			case CimPackage.CIM_FC_PORT__PORT_AVAILABILITY:
				return getPortAvailability();
			case CimPackage.CIM_FC_PORT__PORT_DISCRIMINATOR:
				return getPortDiscriminator();
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
			case CimPackage.CIM_FC_PORT__SUPPORTED_COS:
				getSupportedCOS().clear();
				getSupportedCOS().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FC_PORT__ACTIVE_COS:
				getActiveCOS().clear();
				getActiveCOS().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FC_PORT__SUPPORTED_FC4_TYPES:
				getSupportedFC4Types().clear();
				getSupportedFC4Types().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FC_PORT__ACTIVE_FC4_TYPES:
				getActiveFC4Types().clear();
				getActiveFC4Types().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FC_PORT__DETAILED_PORT_STATE:
				setDetailedPortState((Integer)newValue);
				return;
			case CimPackage.CIM_FC_PORT__DOMAIN_PORT_NUMBER:
				setDomainPortNumber((Integer)newValue);
				return;
			case CimPackage.CIM_FC_PORT__LOGICAL_MODULE_PORT_NUMBER:
				setLogicalModulePortNumber((Integer)newValue);
				return;
			case CimPackage.CIM_FC_PORT__PORT_AVAILABILITY:
				setPortAvailability((Integer)newValue);
				return;
			case CimPackage.CIM_FC_PORT__PORT_DISCRIMINATOR:
				getPortDiscriminator().clear();
				getPortDiscriminator().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_FC_PORT__SUPPORTED_COS:
				getSupportedCOS().clear();
				return;
			case CimPackage.CIM_FC_PORT__ACTIVE_COS:
				getActiveCOS().clear();
				return;
			case CimPackage.CIM_FC_PORT__SUPPORTED_FC4_TYPES:
				getSupportedFC4Types().clear();
				return;
			case CimPackage.CIM_FC_PORT__ACTIVE_FC4_TYPES:
				getActiveFC4Types().clear();
				return;
			case CimPackage.CIM_FC_PORT__DETAILED_PORT_STATE:
				setDetailedPortState(DETAILED_PORT_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT__DOMAIN_PORT_NUMBER:
				setDomainPortNumber(DOMAIN_PORT_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT__LOGICAL_MODULE_PORT_NUMBER:
				setLogicalModulePortNumber(LOGICAL_MODULE_PORT_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT__PORT_AVAILABILITY:
				setPortAvailability(PORT_AVAILABILITY_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT__PORT_DISCRIMINATOR:
				getPortDiscriminator().clear();
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
			case CimPackage.CIM_FC_PORT__SUPPORTED_COS:
				return supportedCOS != null && !supportedCOS.isEmpty();
			case CimPackage.CIM_FC_PORT__ACTIVE_COS:
				return activeCOS != null && !activeCOS.isEmpty();
			case CimPackage.CIM_FC_PORT__SUPPORTED_FC4_TYPES:
				return supportedFC4Types != null && !supportedFC4Types.isEmpty();
			case CimPackage.CIM_FC_PORT__ACTIVE_FC4_TYPES:
				return activeFC4Types != null && !activeFC4Types.isEmpty();
			case CimPackage.CIM_FC_PORT__DETAILED_PORT_STATE:
				return DETAILED_PORT_STATE_EDEFAULT == null ? detailedPortState != null : !DETAILED_PORT_STATE_EDEFAULT.equals(detailedPortState);
			case CimPackage.CIM_FC_PORT__DOMAIN_PORT_NUMBER:
				return DOMAIN_PORT_NUMBER_EDEFAULT == null ? domainPortNumber != null : !DOMAIN_PORT_NUMBER_EDEFAULT.equals(domainPortNumber);
			case CimPackage.CIM_FC_PORT__LOGICAL_MODULE_PORT_NUMBER:
				return LOGICAL_MODULE_PORT_NUMBER_EDEFAULT == null ? logicalModulePortNumber != null : !LOGICAL_MODULE_PORT_NUMBER_EDEFAULT.equals(logicalModulePortNumber);
			case CimPackage.CIM_FC_PORT__PORT_AVAILABILITY:
				return PORT_AVAILABILITY_EDEFAULT == null ? portAvailability != null : !PORT_AVAILABILITY_EDEFAULT.equals(portAvailability);
			case CimPackage.CIM_FC_PORT__PORT_DISCRIMINATOR:
				return portDiscriminator != null && !portDiscriminator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_FC_PORT___DECOMMISSION__BOOLEAN_ELIST:
				return Decommission((Boolean)arguments.get(0), (EList<String>)arguments.get(1));
			case CimPackage.CIM_FC_PORT___RECOMMISSION__ELIST:
				return Recommission((EList<String>)arguments.get(0));
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
		result.append(" (SupportedCOS: ");
		result.append(supportedCOS);
		result.append(", ActiveCOS: ");
		result.append(activeCOS);
		result.append(", SupportedFC4Types: ");
		result.append(supportedFC4Types);
		result.append(", ActiveFC4Types: ");
		result.append(activeFC4Types);
		result.append(", DetailedPortState: ");
		result.append(detailedPortState);
		result.append(", DomainPortNumber: ");
		result.append(domainPortNumber);
		result.append(", LogicalModulePortNumber: ");
		result.append(logicalModulePortNumber);
		result.append(", PortAvailability: ");
		result.append(portAvailability);
		result.append(", PortDiscriminator: ");
		result.append(portDiscriminator);
		result.append(')');
		return result.toString();
	}

} //CIM_FCPortImpl
