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

import org.dmtf.cim.CIM_SNMPTrapIndication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SNMP Trap Indication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPTrapIndicationImpl#getEnterprise <em>Enterprise</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPTrapIndicationImpl#getAgentAddress <em>Agent Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPTrapIndicationImpl#getGenericTrap <em>Generic Trap</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPTrapIndicationImpl#getSpecificTrap <em>Specific Trap</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPTrapIndicationImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPTrapIndicationImpl#getVarBindNames <em>Var Bind Names</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPTrapIndicationImpl#getVarBindSyntaxes <em>Var Bind Syntaxes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SNMPTrapIndicationImpl#getVarBindValues <em>Var Bind Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SNMPTrapIndicationImpl extends CIM_ProcessIndicationImpl implements CIM_SNMPTrapIndication {
	/**
	 * The default value of the '{@link #getEnterprise() <em>Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterprise()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTERPRISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnterprise() <em>Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterprise()
	 * @generated
	 * @ordered
	 */
	protected String enterprise = ENTERPRISE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgentAddress() <em>Agent Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgentAddress() <em>Agent Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentAddress()
	 * @generated
	 * @ordered
	 */
	protected String agentAddress = AGENT_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenericTrap() <em>Generic Trap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericTrap()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GENERIC_TRAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenericTrap() <em>Generic Trap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericTrap()
	 * @generated
	 * @ordered
	 */
	protected Integer genericTrap = GENERIC_TRAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecificTrap() <em>Specific Trap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificTrap()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPECIFIC_TRAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificTrap() <em>Specific Trap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificTrap()
	 * @generated
	 * @ordered
	 */
	protected Long specificTrap = SPECIFIC_TRAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVarBindNames() <em>Var Bind Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarBindNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> varBindNames;

	/**
	 * The cached value of the '{@link #getVarBindSyntaxes() <em>Var Bind Syntaxes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarBindSyntaxes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> varBindSyntaxes;

	/**
	 * The cached value of the '{@link #getVarBindValues() <em>Var Bind Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarBindValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> varBindValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SNMPTrapIndicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SNMPTrapIndication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnterprise() {
		return enterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnterprise(String newEnterprise) {
		String oldEnterprise = enterprise;
		enterprise = newEnterprise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNMP_TRAP_INDICATION__ENTERPRISE, oldEnterprise, enterprise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgentAddress() {
		return agentAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgentAddress(String newAgentAddress) {
		String oldAgentAddress = agentAddress;
		agentAddress = newAgentAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNMP_TRAP_INDICATION__AGENT_ADDRESS, oldAgentAddress, agentAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getGenericTrap() {
		return genericTrap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenericTrap(Integer newGenericTrap) {
		Integer oldGenericTrap = genericTrap;
		genericTrap = newGenericTrap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNMP_TRAP_INDICATION__GENERIC_TRAP, oldGenericTrap, genericTrap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSpecificTrap() {
		return specificTrap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecificTrap(Long newSpecificTrap) {
		Long oldSpecificTrap = specificTrap;
		specificTrap = newSpecificTrap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNMP_TRAP_INDICATION__SPECIFIC_TRAP, oldSpecificTrap, specificTrap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStamp(String newTimeStamp) {
		String oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNMP_TRAP_INDICATION__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVarBindNames() {
		if (varBindNames == null) {
			varBindNames = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_NAMES);
		}
		return varBindNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getVarBindSyntaxes() {
		if (varBindSyntaxes == null) {
			varBindSyntaxes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_SYNTAXES);
		}
		return varBindSyntaxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVarBindValues() {
		if (varBindValues == null) {
			varBindValues = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_VALUES);
		}
		return varBindValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SNMP_TRAP_INDICATION__ENTERPRISE:
				return getEnterprise();
			case CimPackage.CIM_SNMP_TRAP_INDICATION__AGENT_ADDRESS:
				return getAgentAddress();
			case CimPackage.CIM_SNMP_TRAP_INDICATION__GENERIC_TRAP:
				return getGenericTrap();
			case CimPackage.CIM_SNMP_TRAP_INDICATION__SPECIFIC_TRAP:
				return getSpecificTrap();
			case CimPackage.CIM_SNMP_TRAP_INDICATION__TIME_STAMP:
				return getTimeStamp();
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_NAMES:
				return getVarBindNames();
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_SYNTAXES:
				return getVarBindSyntaxes();
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_VALUES:
				return getVarBindValues();
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
			case CimPackage.CIM_SNMP_TRAP_INDICATION__ENTERPRISE:
				setEnterprise((String)newValue);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__AGENT_ADDRESS:
				setAgentAddress((String)newValue);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__GENERIC_TRAP:
				setGenericTrap((Integer)newValue);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__SPECIFIC_TRAP:
				setSpecificTrap((Long)newValue);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__TIME_STAMP:
				setTimeStamp((String)newValue);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_NAMES:
				getVarBindNames().clear();
				getVarBindNames().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_SYNTAXES:
				getVarBindSyntaxes().clear();
				getVarBindSyntaxes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_VALUES:
				getVarBindValues().clear();
				getVarBindValues().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_SNMP_TRAP_INDICATION__ENTERPRISE:
				setEnterprise(ENTERPRISE_EDEFAULT);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__AGENT_ADDRESS:
				setAgentAddress(AGENT_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__GENERIC_TRAP:
				setGenericTrap(GENERIC_TRAP_EDEFAULT);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__SPECIFIC_TRAP:
				setSpecificTrap(SPECIFIC_TRAP_EDEFAULT);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_NAMES:
				getVarBindNames().clear();
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_SYNTAXES:
				getVarBindSyntaxes().clear();
				return;
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_VALUES:
				getVarBindValues().clear();
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
			case CimPackage.CIM_SNMP_TRAP_INDICATION__ENTERPRISE:
				return ENTERPRISE_EDEFAULT == null ? enterprise != null : !ENTERPRISE_EDEFAULT.equals(enterprise);
			case CimPackage.CIM_SNMP_TRAP_INDICATION__AGENT_ADDRESS:
				return AGENT_ADDRESS_EDEFAULT == null ? agentAddress != null : !AGENT_ADDRESS_EDEFAULT.equals(agentAddress);
			case CimPackage.CIM_SNMP_TRAP_INDICATION__GENERIC_TRAP:
				return GENERIC_TRAP_EDEFAULT == null ? genericTrap != null : !GENERIC_TRAP_EDEFAULT.equals(genericTrap);
			case CimPackage.CIM_SNMP_TRAP_INDICATION__SPECIFIC_TRAP:
				return SPECIFIC_TRAP_EDEFAULT == null ? specificTrap != null : !SPECIFIC_TRAP_EDEFAULT.equals(specificTrap);
			case CimPackage.CIM_SNMP_TRAP_INDICATION__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_NAMES:
				return varBindNames != null && !varBindNames.isEmpty();
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_SYNTAXES:
				return varBindSyntaxes != null && !varBindSyntaxes.isEmpty();
			case CimPackage.CIM_SNMP_TRAP_INDICATION__VAR_BIND_VALUES:
				return varBindValues != null && !varBindValues.isEmpty();
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
		result.append(" (Enterprise: ");
		result.append(enterprise);
		result.append(", AgentAddress: ");
		result.append(agentAddress);
		result.append(", GenericTrap: ");
		result.append(genericTrap);
		result.append(", SpecificTrap: ");
		result.append(specificTrap);
		result.append(", TimeStamp: ");
		result.append(timeStamp);
		result.append(", VarBindNames: ");
		result.append(varBindNames);
		result.append(", VarBindSyntaxes: ");
		result.append(varBindSyntaxes);
		result.append(", VarBindValues: ");
		result.append(varBindValues);
		result.append(')');
		return result.toString();
	}

} //CIM_SNMPTrapIndicationImpl
