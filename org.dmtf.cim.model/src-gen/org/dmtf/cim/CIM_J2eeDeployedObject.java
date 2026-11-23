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
 * A representation of the model object '<em><b>CIM J2ee Deployed Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeDeployedObject class is an abstract class that is used to define CIM_J2eeModule objects that are deployed in the CIM_J2eeServer. The Deployed Objects are hosted by a J2ee Server and should hence be associated to a J2eeServer instance through the CIM_HostedService association. The scoping keys in the instance are provided by the J2eeServer hosting the deployed object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeDeployedObject#getDeploymentDescriptor <em>Deployment Descriptor</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeDeployedObject()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.Name='string' override.Name.Description='The name of a J2EE deployed object. The name MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.Name.MaxLen='256' override.Name.MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.1 objectName|V1.0\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeDeployedObject extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Deployment Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the original XML deployment descriptor that was created for this module during the deployment process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Descriptor</em>' attribute.
	 * @see #setDeploymentDescriptor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeDeployedObject_DeploymentDescriptor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"JSR77.JCP|JSR77.3.5.0.1 deploymentDescriptor|V1.0\"]'"
	 * @generated
	 */
	String getDeploymentDescriptor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeDeployedObject#getDeploymentDescriptor <em>Deployment Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Descriptor</em>' attribute.
	 * @see #getDeploymentDescriptor()
	 * @generated
	 */
	void setDeploymentDescriptor(String value);

} // CIM_J2eeDeployedObject
