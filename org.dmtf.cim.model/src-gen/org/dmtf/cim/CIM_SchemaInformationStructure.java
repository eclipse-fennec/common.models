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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Schema Information Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_SchemaInformation structure describes information for a specific version of a schema.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SchemaInformationStructure#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SchemaInformationStructure#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SchemaInformationStructure#getDescription <em>Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SchemaInformationStructure#getURI <em>URI</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SchemaInformationStructure#getOwningOrganization <em>Owning Organization</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SchemaInformationStructure#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SchemaInformationStructure()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Structure='true' Version='2.38.0' UMLPackagePath='CIM::Interop::Schema'"
 * @generated
 */
@ProviderType
public interface CIM_SchemaInformationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The schema name (as defined in DSP0004). For example, CIM or PRS. NOTE: The schema name shall not include the underscore character.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SchemaInformationStructure_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SchemaInformationStructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The schema version in M.N.U (Major.Minor.Update) format. For example 2.36.0 or 1.0.0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SchemaInformationStructure_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SchemaInformationStructure#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description for this schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SchemaInformationStructure_Description()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SchemaInformationStructure#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URI (see RFC3986) that uniquely identifies this schema version. Note that this is a URI for iddentifying the schema version, not a URL for accessing it. For example, http://schemas.dmtf.org/wbem/cim-schema/2.35.0/.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SchemaInformationStructure_URI()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SchemaInformationStructure#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

	/**
	 * Returns the value of the '<em><b>Owning Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The owning organization of the schema. For example, DMTF, SNIA or ACME
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Organization</em>' attribute.
	 * @see #setOwningOrganization(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SchemaInformationStructure_OwningOrganization()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOwningOrganization();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SchemaInformationStructure#getOwningOrganization <em>Owning Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Organization</em>' attribute.
	 * @see #getOwningOrganization()
	 * @generated
	 */
	void setOwningOrganization(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SchemaInformationStructure_Status()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"2\",\"3\",\"..\"]' Values='[\"Unknown\",\"Final\",\"Experimental\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Long getStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SchemaInformationStructure#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Long value);

} // CIM_SchemaInformationStructure
