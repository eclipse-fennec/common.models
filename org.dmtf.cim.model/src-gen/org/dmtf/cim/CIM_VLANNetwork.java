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
 * A representation of the model object '<em><b>CIM VLAN Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_VLANNetwork represent the management aspects of a Virtual Local Area Network (VLAN) as used within a network switch.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VLANNetwork#getVLANId <em>VLAN Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANNetwork#getSAIdentifier <em>SA Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANNetwork#getTransmissionSize <em>Transmission Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANNetwork#getTypeOfMedia <em>Type Of Media</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANNetwork#getPrivateVLANType <em>Private VLAN Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANNetwork#getPrimaryVLANId <em>Primary VLAN Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VLANNetwork#getAssociatedVLANIds <em>Associated VLAN Ids</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VLANNetwork()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Network' MappingStrings='[\"Recommendation.ITU|M3100.Network\"]' override.OtherTypeDescription='string' override.OtherTypeDescription.Description='A string describing the type of media that is supported by this VLAN, when the value of the Type property is set to 1 (i.e., \"Other\"). This property should be set to NULL when the Type property is any value other than 1.' override.OtherTypeDescription.ModelCorrespondence='[\"CIM_VLANNetwork.TypeOfMedia\"]' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_VLANNetwork extends CIM_Network {
	/**
	 * Returns the value of the '<em><b>VLAN Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 12-bit VLAN ID used in the VLAN Tag header.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VLAN Id</em>' attribute.
	 * @see #setVLANId(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANNetwork_VLANId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='1' MaxValue='4094' MappingStrings='[\"MIB.IETF|Q-BRIDGE-MIB.VlanId\"]'"
	 * @generated
	 */
	Integer getVLANId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANNetwork#getVLANId <em>VLAN Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VLAN Id</em>' attribute.
	 * @see #getVLANId()
	 * @generated
	 */
	void setVLANId(Integer value);

	/**
	 * Returns the value of the '<em><b>SA Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the 802.10 SAID field which would be used for this VLAN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SA Identifier</em>' attribute.
	 * @see #setSAIdentifier(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANNetwork_SAIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getSAIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANNetwork#getSAIdentifier <em>SA Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SA Identifier</em>' attribute.
	 * @see #getSAIdentifier()
	 * @generated
	 */
	void setSAIdentifier(Long value);

	/**
	 * Returns the value of the '<em><b>Transmission Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this property is set to a positive integer when the value of the MTU for all embers (switch endpoints/endstationendpoints of the VLAN is the same, otherwise is set to -1 and the Transmission size is set on each of the individual endpoints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmission Size</em>' attribute.
	 * @see #setTransmissionSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANNetwork_TransmissionSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getTransmissionSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANNetwork#getTransmissionSize <em>Transmission Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Size</em>' attribute.
	 * @see #getTransmissionSize()
	 * @generated
	 */
	void setTransmissionSize(Long value);

	/**
	 * Returns the value of the '<em><b>Type Of Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines/restricts the media type of the VLAN. This 
	 * information is also needed when a VLAN is not yet associated to any end point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Media</em>' attribute.
	 * @see #setTypeOfMedia(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANNetwork_TypeOfMedia()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5..16000\",\"..\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"Ethernet\",\"FDDI\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_VLANNetwork.OtherTypeDescription\"]'"
	 * @generated
	 */
	Integer getTypeOfMedia();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANNetwork#getTypeOfMedia <em>Type Of Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Media</em>' attribute.
	 * @see #getTypeOfMedia()
	 * @generated
	 */
	void setTypeOfMedia(Integer value);

	/**
	 * Returns the value of the '<em><b>Private VLAN Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A private VLAN allows the sub divsion of a VLAN, the Primary VLAN in a single IP subnet. The secondary VLANs can be in a community, they can communicate with each other but not other secondary VLAN in the same primary VLAN, or Isolated - only able to communicate to ports on the Primary VLAN. 2 - Not private 3 - Primary 4 - Community 5- Isolated ),
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private VLAN Type</em>' attribute.
	 * @see #setPrivateVLANType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANNetwork_PrivateVLANType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"Not Private\",\"Primary\",\"Community\",\"Isolated\"]'"
	 * @generated
	 */
	Integer getPrivateVLANType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANNetwork#getPrivateVLANType <em>Private VLAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private VLAN Type</em>' attribute.
	 * @see #getPrivateVLANType()
	 * @generated
	 */
	void setPrivateVLANType(Integer value);

	/**
	 * Returns the value of the '<em><b>Primary VLAN Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If PrivateVLANType matches 4(Community) or 5(Isolated) then PrimaryVLANId is the VLANId of primary VLAN to which the VLAN is bound
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary VLAN Id</em>' attribute.
	 * @see #setPrimaryVLANId(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANNetwork_PrimaryVLANId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPrimaryVLANId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLANNetwork#getPrimaryVLANId <em>Primary VLAN Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary VLAN Id</em>' attribute.
	 * @see #getPrimaryVLANId()
	 * @generated
	 */
	void setPrimaryVLANId(Integer value);

	/**
	 * Returns the value of the '<em><b>Associated VLAN Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If PrivateVLANType matches 3(Primary) then associatedVLANId is an array of VLANIds of the secondary VLANs associated with the Primary VLAN
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated VLAN Ids</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VLANNetwork_AssociatedVLANIds()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]'"
	 * @generated
	 */
	EList<Integer> getAssociatedVLANIds();

} // CIM_VLANNetwork
