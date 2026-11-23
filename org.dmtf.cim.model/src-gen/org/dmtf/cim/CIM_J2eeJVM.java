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
 * A representation of the model object '<em><b>CIM J2ee JVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeJVM class identifies a Java VM that is utilized by a J2EE server. For each Java VM that is running threads associated with the J2EE server, its containers or resources, there must be an instance in this class. The instance must be removed when the Java VM is no longer running. The reason this class subclasses from a class as high up in the hierarchy as CIM_EnabledLogicalElement is the absence of a class that models Interpreters, Emulators and the like. The JVM is not an OS, but then neither is it just a process. In v2.9, we hope to plug this hole by introducing a class that will model interpreters and emulators. At this point, the JVM class can be pushed down in the hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJVM#getJavaVersion <em>Java Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJVM#getJavaVendor <em>Java Vendor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJVM#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJVM()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='InstanceID identifies a unique instance of a J2ee JVM In order to ensure uniqueness, the value of InstanceID MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.InstanceID.ModelCorrespondence='[\"CIM_J2eeJVM.Name\"]' override.Name='string' override.Name.Description='The name of a J2EE JVM. The name MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.Name.MaxLen='256' override.Name.MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.1 objectName|V1.0\"]' override.Name.ModelCorrespondence='[\"CIM_J2eeJVM.InstanceID\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJVM extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>Java Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Java Runtime Environment version of the JVM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Java Version</em>' attribute.
	 * @see #setJavaVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJVM_JavaVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"JSR77.JCP|JSR77.3.4.1.1 javaVersion|V1.0\"]'"
	 * @generated
	 */
	String getJavaVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJVM#getJavaVersion <em>Java Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Version</em>' attribute.
	 * @see #getJavaVersion()
	 * @generated
	 */
	void setJavaVersion(String value);

	/**
	 * Returns the value of the '<em><b>Java Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Java Runtime Environment vendor of the JVM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Java Vendor</em>' attribute.
	 * @see #setJavaVendor(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJVM_JavaVendor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"JSR77.JCP|JSR77.3.4.1.2 javaVendor|V1.0\"]'"
	 * @generated
	 */
	String getJavaVendor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJVM#getJavaVendor <em>Java Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Vendor</em>' attribute.
	 * @see #getJavaVendor()
	 * @generated
	 */
	void setJavaVendor(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node (machine) this JVM is running on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJVM_Node()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"JSR77.JCP|JSR77.3.4.1.3 node|V1.0\"]'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJVM#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

} // CIM_J2eeJVM
