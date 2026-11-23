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
 * A representation of the model object '<em><b>CIM Network Policy Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class describes a network policy service. The network policy service can used to manage network policies like firewall, load balancing, QoS, DHCP, and DNS. Typically, this network policy service corresponds to an abstraction of the service within a domain (for example, an orchestration layer).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPolicyService#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPolicyService#getOtherServiceTypeDescription <em>Other Service Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPolicyService#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPolicyService#getServiceIDType <em>Service ID Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.54.0' UMLPackagePath='CIM::Network' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkPolicyService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property describes the type of network policy service supported. This property does not identify an instance of a specific type of network policy service.
	 * Load Balancer: describes a load balancing service for the management and application of load balancer policies and rules.
	 * QoS: describes a Quality of Service (QoS) service for the management and application of QoS policies and rules.
	 * Firewall: describes a firewalling service for the management and application of firewall policies and rules.
	 * VPN: describes a Virtual Private Network (VPN) service for the configuration and management of VPNs.
	 * DHCPv4: describes a DHCP service for automatic network configuration of client systems on IPv4 networks.
	 * DHCPv6: describes a DHCP service for automatic network configuration of client systems on IPv6 networks. 
	 * DNS: describes a Dynamic Name System (DNS) resolution service.
	 * NAT: describes a Network Address Translation (NAT) service for the configuration of NAT rules. 
	 * Gateway: describes a gateway service for the configuration and management of gateway's functionalities.
	 * Layer4 Port Forwarding: describes a Port Forwarding service based on Layer 4 protocols for the configuration of port forwarding rules.
	 * IP Routing: describes a IP routing service for the configuration and management of routing rules.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see #setServiceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyService_ServiceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Load Balancer\",\"QoS\",\"Firewall\",\"VPN\",\"DHCPv4\",\"DHCPv6\",\"DNS\",\"NAT\",\"Gateway\",\"Layer4 Port Forwarding\",\"IP Routing\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getServiceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPolicyService#getServiceType <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' attribute.
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Service Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the network policy service type when the ServiceType is set to 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Service Type Description</em>' attribute.
	 * @see #setOtherServiceTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyService_OtherServiceTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherServiceTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPolicyService#getOtherServiceTypeDescription <em>Other Service Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Service Type Description</em>' attribute.
	 * @see #getOtherServiceTypeDescription()
	 * @generated
	 */
	void setOtherServiceTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies an instance of a network policy service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service ID</em>' attribute.
	 * @see #setServiceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyService_ServiceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_NetworkPolicyService.ServiceIDType\"]'"
	 * @generated
	 */
	String getServiceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPolicyService#getServiceID <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service ID</em>' attribute.
	 * @see #getServiceID()
	 * @generated
	 */
	void setServiceID(String value);

	/**
	 * Returns the value of the '<em><b>Service ID Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property describes the type of identifier used to identify an instance of a network policy service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service ID Type</em>' attribute.
	 * @see #setServiceIDType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyService_ServiceIDType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"URI\",\"UUID\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_NetworkPolicyService.ServiceID\"]'"
	 * @generated
	 */
	Integer getServiceIDType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NetworkPolicyService#getServiceIDType <em>Service ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service ID Type</em>' attribute.
	 * @see #getServiceIDType()
	 * @generated
	 */
	void setServiceIDType(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates an instance of CIM_NetworkPolicyRule class and instances of CIM_NetworkPolicyCondition, CIM_NetworkPolicyAction, CIM_NetworkPolicyRuleSettingData, and CIM_NetworkPolicyActionSettingData classes and all mandatory associations between these instances
	 * @param NetworkPolicyAction an array of embedded instances of the class CIM_NetworkPolicyAction associated with the created rule. This array is indexed with the ActionOrder parameter.
	 * @param ActionsOrder An optional array corresponding to the NetworkPolicyAction, ActionOrder is an unsigned integer that indicates the relative position of a PolicyAction in the sequence of actions associated with a NetworkPolicyRule. This parameter populates the ActionOrder parameter in the corresponding CIM_PolicyActionInPolicyRule association instance.
	 * @param NetworkPolicyCondition An array of enbedded instance of the class CIM_NetworkPolicyCondition to be associated with the created rule rule.
	 * @param ConditionGroupNumber An array unsigned integer corresponding to the NetworkPolicyCondition input indicating the group to which the contained NetworkPolicyCondition belongs. This integer segments the Conditions into the ANDed sets (when the ConditionListType is "DNF") or similarly, into the ORed sets (when the ConditionListType is "CNF"). This value is used to populate the ConditionGroupNumber property in the association in the corresponding association CIM_PolicyConditionInPolicyRule
	 * @param NetworkPolicyRuleSettingData An embedded instance of CIM_NetworkPolicyRuleSettingData. This array corresponds to the NetworkPolicyRule input array, the created instance of the embedded class is associated with the corresponding CIM_NetworkPolicyRule.
	 * @param NetworkPolicyActionSettingData An embedded instance of CIM_NetworkPolicyActionSettingData. This array corresponds to the NetworkPolicyAction input array, the created instance of the embedded class is associated with the corresponding CIM_NetworkPolicyAction.
	 * @param NetworkPolicyRule Reference to the created instance of CIM_NetworkPolicyRule
	 * <!-- end-model-doc -->
	 * @model NetworkPolicyActionUnique="false" NetworkPolicyActionMany="true"
	 *        NetworkPolicyActionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_NetworkPolicyAction' ArrayType='Indexed'" ActionsOrderUnique="false" ActionsOrderMany="true"
	 *        ActionsOrderAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed'" NetworkPolicyConditionUnique="false" NetworkPolicyConditionMany="true"
	 *        NetworkPolicyConditionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_NetworkPolicyCondition'" ConditionGroupNumberUnique="false" ConditionGroupNumberMany="true"
	 *        ConditionGroupNumberAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]'" NetworkPolicyRuleSettingDataUnique="false" NetworkPolicyRuleSettingDataMany="true"
	 *        NetworkPolicyRuleSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_NetworkPolicyRuleSettingData'" NetworkPolicyActionSettingDataUnique="false" NetworkPolicyActionSettingDataMany="true"
	 *        NetworkPolicyActionSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_NetworkPolicyActionSettingData'" NetworkPolicyRuleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NetworkPolicyRule REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long CreatePolicyRule(EList<String> NetworkPolicyAction, EList<Integer> ActionsOrder, EList<String> NetworkPolicyCondition, EList<Integer> ConditionGroupNumber, EList<String> NetworkPolicyRuleSettingData, EList<String> NetworkPolicyActionSettingData, CIM_NetworkPolicyRule NetworkPolicyRule);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method removes the referenced instances CIM_NetworkPolicyRule and all associated instances of CIM_NetworkPolicyAction, CIM_NetworkPolicyCondition, CIM_NetworkPolicyRuleSettingData, and CIM_NetworkPolicyActionSettingData that are only associated with the rule specified in this method input parameter.
	 * @param NetworkPolicyRule An array of referenced instances of CIM_NetworkPolicyRule to be deleted.
	 * <!-- end-model-doc -->
	 * @model NetworkPolicyRuleUnique="false" NetworkPolicyRuleMany="true"
	 *        NetworkPolicyRuleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NetworkPolicyRule REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long DeletePolicyRules(EList<CIM_NetworkPolicyRule> NetworkPolicyRule);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the Network Policy Rule to the specified instances of the CIM_ManagedElement. This method creates the instances of the CIM_PolicySetAppliesToElement association between the specified instance of the CIM_NetworkPolicyRule and the instances of CIM_ManagedElement subclasses, which references are supplied.
	 * @param NetworkPolicyRule The rule to apply
	 * @param ManagedElememt The managed elements to which to apply the rule
	 * <!-- end-model-doc -->
	 * @model NetworkPolicyRuleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NetworkPolicyRule REF'" ManagedElememtUnique="false" ManagedElememtMany="true"
	 *        ManagedElememtAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ApplyPolicyRule(CIM_NetworkPolicyRule NetworkPolicyRule, EList<CIM_ManagedElement> ManagedElememt);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes the Network Policy Rule from the ManagedElement instances it was applied before. This method deletes the instances of the CIM_PolicySetAppliesToElement association between the specified instance of the CIM_NetworkPolicyRule and the instances of CIM_ManagedElement subclasses, which references are supplied.
	 * @param NetworkPolicyRule Reference to the rule to be removed
	 * @param ManagedElement The Manged Elements from which the rule is to be released.
	 * <!-- end-model-doc -->
	 * @model NetworkPolicyRuleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NetworkPolicyRule REF'" ManagedElementUnique="false" ManagedElementMany="true"
	 *        ManagedElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ReleasePolicyRule(CIM_NetworkPolicyRule NetworkPolicyRule, EList<CIM_ManagedElement> ManagedElement);

} // CIM_NetworkPolicyService
