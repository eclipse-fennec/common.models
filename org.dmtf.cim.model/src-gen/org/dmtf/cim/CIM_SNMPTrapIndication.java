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
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM SNMP Trap Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A concrete class for mapping an SNMP Trap to CIM based on the IETF RFC 1157. The usefulness of this class is to describe common trap semantics. But, a complete understanding of any trap data received relies on the Indicaton recipient having access to the sender's MIB. Understanding can be improved by mapping the SNMP domain to CIM, and using CIM LifeCycle and standard subclasses of CIM_ProcessIndication.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SNMPTrapIndication#getEnterprise <em>Enterprise</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPTrapIndication#getAgentAddress <em>Agent Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPTrapIndication#getGenericTrap <em>Generic Trap</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPTrapIndication#getSpecificTrap <em>Specific Trap</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPTrapIndication#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPTrapIndication#getVarBindNames <em>Var Bind Names</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPTrapIndication#getVarBindSyntaxes <em>Var Bind Syntaxes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SNMPTrapIndication#getVarBindValues <em>Var Bind Values</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapIndication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.7.0' UMLPackagePath='CIM::Event'"
 * @generated
 */
@ProviderType
public interface CIM_SNMPTrapIndication extends CIM_ProcessIndication {
	/**
	 * Returns the value of the '<em><b>Enterprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of object generating the trap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enterprise</em>' attribute.
	 * @see #setEnterprise(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapIndication_Enterprise()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"PDU.IETF|RFC1157-TRAP-PDU.enterprise\"]'"
	 * @generated
	 */
	String getEnterprise();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SNMPTrapIndication#getEnterprise <em>Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterprise</em>' attribute.
	 * @see #getEnterprise()
	 * @generated
	 */
	void setEnterprise(String value);

	/**
	 * Returns the value of the '<em><b>Agent Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address of the object generating the trap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent Address</em>' attribute.
	 * @see #setAgentAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapIndication_AgentAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"PDU.IETF|RFC1157-TRAP-PDU.agent-addr\"]'"
	 * @generated
	 */
	String getAgentAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SNMPTrapIndication#getAgentAddress <em>Agent Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Address</em>' attribute.
	 * @see #getAgentAddress()
	 * @generated
	 */
	void setAgentAddress(String value);

	/**
	 * Returns the value of the '<em><b>Generic Trap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that describes the generic trap type: 
	 * - The coldStart(0) trap signifies that the sending protocol entity is reinitializing itself such that the agent's configuration or the protocol entity implementation may be altered. 
	 * - The warmStart(1) trap signifies that the sending protocol entity is reinitializing itself such that neither the agent configuration nor the protocol entity implementation is altered. 
	 * - The linkDown(2) trap signifies that the sending protocol recognizes a failure in one of the communication links represented in the agent's configuration. The Trap-PDU of type linkDown contains as the first element of its variable-bindings the name and value of the ifIndex instance for the affected interface. 
	 * - The linkUp(3) trap signifies that the sending protocol entity recognizes that one of the communication links represented in the agent's configuration has come up. The Trap-PDU of type linkUp contains as the first element of its variable-bindings, the name and value of the ifIndex instance for the affected interface. 
	 * - An authenticationFailure(4) trap signifies that the sending protocol entity is the adressee of a protocol message that was not properly authenticated. While implementations of SNMP must be capable of generating this trap, they must also be capable of suppressing the emission of such traps via an implementation- specific mechanism. 
	 * - An egpNeighborLoss(5) trap signifies that an EGP neighbor for whom the sending protocol entity was an EGP peer has been marked as down and the peer relationship no longer pertains. The Trap-PDU of type egpNeighborLoss contains as the first element of its variable-bindings, the name and value of the egpNeighAddr instance for the affected neighbor. 
	 * - An enterpriseSpecific(6) trap signifies that the sending protocol entity recognizes that some enterprise-specific event has occurred. The specific-trap field identifies the particular trap which occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generic Trap</em>' attribute.
	 * @see #setGenericTrap(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapIndication_GenericTrap()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Cold Start\",\"Warm Start\",\"Link Down\",\"Link Up\",\"Authentication Failure\",\"EGP Neighbor Loss\",\"Enterprise Specific\"]' MappingStrings='[\"PDU.IETF|RFC1157-TRAP-PDU.generic-trap\"]'"
	 * @generated
	 */
	Integer getGenericTrap();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SNMPTrapIndication#getGenericTrap <em>Generic Trap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Trap</em>' attribute.
	 * @see #getGenericTrap()
	 * @generated
	 */
	void setGenericTrap(Integer value);

	/**
	 * Returns the value of the '<em><b>Specific Trap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific trap code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Trap</em>' attribute.
	 * @see #setSpecificTrap(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapIndication_SpecificTrap()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"PDU.IETF|RFC1157-TRAP-PDU.specific-trap\"]'"
	 * @generated
	 */
	Long getSpecificTrap();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SNMPTrapIndication#getSpecificTrap <em>Specific Trap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Trap</em>' attribute.
	 * @see #getSpecificTrap()
	 * @generated
	 */
	void setSpecificTrap(Long value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time elapsed between the last (re)intialization of the managed entity and the generation of the trap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapIndication_TimeStamp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"PDU.IETF|RFC1157-TRAP-PDU.time-stamp\"]'"
	 * @generated
	 */
	String getTimeStamp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SNMPTrapIndication#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(String value);

	/**
	 * Returns the value of the '<em><b>Var Bind Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object naming information (an OID) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindSyntaxes and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Var Bind Names</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapIndication_VarBindNames()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"PDU.IETF|RFC1157-TRAP-PDU.variable-bindings\"]' ModelCorrespondence='[\"CIM_SNMPTrapIndication.VarBindSyntaxes\",\"CIM_SNMPTrapIndication.VarBindValues\"]'"
	 * @generated
	 */
	EList<String> getVarBindNames();

	/**
	 * Returns the value of the '<em><b>Var Bind Syntaxes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object syntax information (defined as an enumerated value) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Var Bind Syntaxes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapIndication_VarBindSyntaxes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Integer\",\"OctetString\",\"ObjectIdentifier\",\"NetworkAddress\",\"Counter\",\"Gauge\",\"TimeTicks\",\"Opaque\"]' ArrayType='Indexed' MappingStrings='[\"PDU.IETF|RFC1157-TRAP-PDU.variable-bindings\"]' ModelCorrespondence='[\"CIM_SNMPTrapIndication.VarBindNames\",\"CIM_SNMPTrapIndication.VarBindValues\"]'"
	 * @generated
	 */
	EList<Integer> getVarBindSyntaxes();

	/**
	 * Returns the value of the '<em><b>Var Bind Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An OctetString representing object value information from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindSyntaxes arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Var Bind Values</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPTrapIndication_VarBindValues()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true' ArrayType='Indexed' MappingStrings='[\"PDU.IETF|RFC1157-TRAP-PDU.variable-bindings\"]' ModelCorrespondence='[\"CIM_SNMPTrapIndication.VarBindNames\",\"CIM_SNMPTrapIndication.VarBindSyntaxes\"]'"
	 * @generated
	 */
	EList<String> getVarBindValues();

} // CIM_SNMPTrapIndication
