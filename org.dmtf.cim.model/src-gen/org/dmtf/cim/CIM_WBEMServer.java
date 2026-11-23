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
 * A representation of the model object '<em><b>CIM WBEM Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_WBEMServer represents a WBEMServer and serves as an aggregation point for the WBEM Server settings, capabilities, services, protocols, etc.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WBEMServer()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.38.0' UMLPackagePath='CIM::Interop::WBEMServer' override.Description='string' override.Description.Required='true' override.Description.Description='The Description of the WBEM Server (e.g. ACME WBEM Server 1.0.0).' override.ElementName='string' override.ElementName.Required='true' override.ElementName.Description='The ElementName property is used as a name of the WBEM Server for human interfaces. For example, \"ACME WBEM Server\").' override.Name='string' override.Name.Key='true' override.Name.Description='The Name property is used to uniquely identify a WBEM Server. The WBEM Server shall ensure that this value is globally unique.' override.Name.MaxLen='256' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_WBEMServer extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreateNamespace creates an Namespace. Upon successful completion of the method, there shall be a newly created instance of CIM_WBEMServerNamespace associated through the CIM_HostedDependency association with this instance of CIM_WBEMServer.
	 * @param NamespaceTemplate NamespaceTemplate is a template for the desired Namespace to be created.
	 * @param Namespace Reference to the instance of CIM_WBEMServerNamespace created when the method returns a value of 0.
	 * @param Errors Error information for this method. This coudl include any information the implementation wants to return during the process of this method, even if completed successfully.
	 * <!-- end-model-doc -->
	 * @model NamespaceTemplateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedInstance='CIM_WBEMServerNamespace'" NamespaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_WBEMServerNamespace REF' In='false' Out='true'" ErrorsUnique="false" ErrorsMany="true"
	 *        ErrorsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true' EmbeddedInstance='CIM_Error'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"..\"]' Values='[\"Completed with No Error\",\"Failed\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Long CreateWBEMServerNamespace(String NamespaceTemplate, CIM_WBEMServerNamespace Namespace, EList<String> Errors);

} // CIM_WBEMServer
