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
 * A representation of the model object '<em><b>CIM J2ee Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_J2eeApplication identifies a J2EE application that resides on a J2ee Server.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeApplication#getDeploymentDescriptor <em>Deployment Descriptor</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeApplication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.Name='string' override.Name.Description='The name of a J2EE Application. The name MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.Name.MaxLen='256' override.Name.MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.1 objectName|V1.0\"]' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeApplication extends CIM_ApplicationSystem {
	/**
	 * Returns the value of the '<em><b>Deployment Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the original XML deployment descriptor that was created for this application during the deployment process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Descriptor</em>' attribute.
	 * @see #setDeploymentDescriptor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeApplication_DeploymentDescriptor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"JSR77.JCP|JSR77.3.5.0.1 deploymentDescriptor|V1.0\"]'"
	 * @generated
	 */
	String getDeploymentDescriptor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeApplication#getDeploymentDescriptor <em>Deployment Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Descriptor</em>' attribute.
	 * @see #getDeploymentDescriptor()
	 * @generated
	 */
	void setDeploymentDescriptor(String value);

} // CIM_J2eeApplication
