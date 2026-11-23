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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Replication Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a replication entity, such as an entity known by its World Wide Name (WWN).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationEntity#getType <em>Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationEntity#getEntityID <em>Entity ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationEntity#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationEntity#getPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationEntity#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationEntity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above \"preferred\" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the \"preferred\" algorithm must be used with the &lt;OrgID&gt; set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ReplicationEntity extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how to interpret the information appearing in EntityID. 
	 * Encoded in EntityID: indicates the ID has an implementation specific method of including the entity type in the ID. For example: "vol+foobar" says the entity represents a volume called foobar. 
	 * Embedded Instance: indicates the object is an embedded instance found in the property Element. 
	 * URI: Refers to a WBEM URI value per DMTF DSP0207 specification. 
	 * Objectpath: The address of an object consisting of a namespace path and model path per DMTF DSP0004 specification. 
	 * Partition: The entity represents a disk partition. 
	 * ReplicationGroup: The entity represents a ReplicationGroup. 
	 * ComputerSystem: The entity represents a ComputerSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationEntity_Type()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"StoragePool\",\"StorageExtent\",\"StorageVolume\",\"LogicalDisk\",\"Filesystem\",\"WWN\",\"URI\",\"Objectpath\",\"Encoded in EntityID\",\"Embedded Instance\",\"Partition\",\"ReplicationGroup\",\"ComputerSystem\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ReplicationEntity.EntityID\",\"CIM_ReplicationEntity.OtherTypeDescription\",\"CIM_ReplicationEntity.Element\"]'"
	 * @generated
	 */
	Integer getType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationEntity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Integer value);

	/**
	 * Returns the value of the '<em><b>Entity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ID representing the resource identified by this entity. For example, the WWN or the URI of an element. The property Type is to be used to interpret the ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity ID</em>' attribute.
	 * @see #setEntityID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationEntity_EntityID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ReplicationEntity.Type\"]'"
	 * @generated
	 */
	String getEntityID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationEntity#getEntityID <em>Entity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity ID</em>' attribute.
	 * @see #getEntityID()
	 * @generated
	 */
	void setEntityID(String value);

	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Populated when "Type" has the value of "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationEntity_OtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ReplicationEntity.Type\"]'"
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationEntity#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false, the instance of this object, not the element represented by this entity, may be deleted at the completion of a copy operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationEntity_Persistent()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getPersistent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationEntity#getPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #getPersistent()
	 * @generated
	 */
	void setPersistent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Populated when "Type" has the value of "Embedded Instance".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationEntity_Element()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' EmbeddedInstance='CIM_LogicalElement' ModelCorrespondence='[\"CIM_ReplicationEntity.Type\"]'"
	 * @generated
	 */
	String getElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationEntity#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(String value);

} // CIM_ReplicationEntity
