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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Generic Operation Capabilities Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_GenericOperationCapabilitiesStructure defines a structure of the generic operations capabilities supported by a WBEM implementation (e.g. WBEM Server, WBEM Protocol, WBEM Provider, ...). One use of this strucutre would be to add to a capabilities class and associate via CIM_ElementCapabilities. For more information, see Generic Operations (DSP0223).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure#getFQLSupported <em>FQL Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure#getCQLSupport <em>CQL Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure#getOperationsSupported <em>Operations Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure#getOtherOperationsSupportedDescriptions <em>Other Operations Supported Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure#getContinueOnErrorSupported <em>Continue On Error Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure#getMinimumOperationTimeout <em>Minimum Operation Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure#getMaximumOperationTimeout <em>Maximum Operation Timeout</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_GenericOperationCapabilitiesStructure()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Structure='true' Version='2.38.0' UMLPackagePath='CIM::Interop::Operations'"
 * @generated
 */
@ProviderType
public interface CIM_GenericOperationCapabilitiesStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>FQL Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is FQL (Filter Query Language, DSP0212) supported?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FQL Supported</em>' attribute.
	 * @see #setFQLSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_GenericOperationCapabilitiesStructure_FQLSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getFQLSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure#getFQLSupported <em>FQL Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FQL Supported</em>' attribute.
	 * @see #getFQLSupported()
	 * @generated
	 */
	void setFQLSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>CQL Support</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CQLSupport describes the levels of CQL Supported. If Not Supported the array shall have a single entry of 0 (Not Supported). For more information refer to the CIM Query Language Specification, DSP0202.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CQL Support</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_GenericOperationCapabilitiesStructure_CQLSupport()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"..\"]' Values='[\"Not Supported\",\"Basic Query\",\"Simple Join\",\"Complex Join\",\"Subquery\",\"Result Set Operations\",\"Extended Select List\",\"Embedded Properties\",\"Aggregations\",\"Regular Expression Like\",\"Array Range\",\"Satisfies Array\",\"Foreign Namespace Support\",\"Arithmetic Expression\",\"Full Unicode Support\",\"Conversion Utilities\",\"Property Scoping\",\"Association Traversal\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	EList<Long> getCQLSupport();

	/**
	 * Returns the value of the '<em><b>Operations Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of Generic Operations supported. Generic Operations are defined in DSP0223.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operations Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_GenericOperationCapabilitiesStructure_OperationsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"..\"]' Values='[\"Other\",\"GetInstance\",\"DeleteInstance\",\"ModifyInstance\",\"CreateInstance\",\"EnumerateInstances\",\"EnumerateInstanceNames\",\"Associators\",\"AssociatorNames\",\"References\",\"ReferenceNames\",\"OpenEnumerateInstances\",\"OpenEnumerateInstancePaths\",\"OpenAssociators\",\"OpenAssociatorPaths\",\"OpenReferences\",\"OpenReferencePaths\",\"OpenQueryInstances\",\"PullInstancesWithPath\",\"PullInstancePaths\",\"PullInstances\",\"CloseEnumeration\",\"EnumerationCount\",\"InvokeMethod\",\"InvokeStaticMethod\",\"GetClass\",\"DeleteClass\",\"ModifyClass\",\"CreateClass\",\"EnumerateClasses\",\"EnumerateClassNames\",\"AssociatorClasses\",\"AssociatorClassPaths\",\"ReferenceClasses\",\"ReferenceClassPaths\",\"GetQualifierType\",\"DeleteQualifierType\",\"ModifyQualifierType\",\"CreateQualifierType\",\"EnumerateQualifierTypes\",\"DMTF Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_GenericOperationCapabilitiesStructure.OtherOperationsSupportedDescriptions\"]'"
	 * @generated
	 */
	EList<Long> getOperationsSupported();

	/**
	 * Returns the value of the '<em><b>Other Operations Supported Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If OperationsSupported has the value 1 (Other), then the corresponding element in this array shall have the name of the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Operations Supported Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_GenericOperationCapabilitiesStructure_OtherOperationsSupportedDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_GenericOperationCapabilitiesStructure.OperationsSupported\"]'"
	 * @generated
	 */
	EList<String> getOtherOperationsSupportedDescriptions();

	/**
	 * Returns the value of the '<em><b>Continue On Error Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is ContinueOnError supported as defined in Generic Operations (DSP0223)?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continue On Error Supported</em>' attribute.
	 * @see #setContinueOnErrorSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_GenericOperationCapabilitiesStructure_ContinueOnErrorSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getContinueOnErrorSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure#getContinueOnErrorSupported <em>Continue On Error Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue On Error Supported</em>' attribute.
	 * @see #getContinueOnErrorSupported()
	 * @generated
	 */
	void setContinueOnErrorSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum Operation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationTimeout is defined in Generic Operations (DSP0223). It is used to determine when the WBEM Server can close an enumeration session. MinimumOperationTimeout is the minimum number of seconds allowed for the OperationTimeout parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Operation Timeout</em>' attribute.
	 * @see #setMinimumOperationTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_GenericOperationCapabilitiesStructure_MinimumOperationTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' PUnit='second'"
	 * @generated
	 */
	Long getMinimumOperationTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure#getMinimumOperationTimeout <em>Minimum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Operation Timeout</em>' attribute.
	 * @see #getMinimumOperationTimeout()
	 * @generated
	 */
	void setMinimumOperationTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Maximum Operation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationTimeout is defined in Generic Operations (DSP0223). It is used to determine when the WBEM Server can close an enumeration session. MaximumOperationTimeout is the maximum number of seconds allowed for the OperationTimeout parameter. If the value is 0, then there is no operation timeout. That is, the enumeration session is never closed based on time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Operation Timeout</em>' attribute.
	 * @see #setMaximumOperationTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_GenericOperationCapabilitiesStructure_MaximumOperationTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' PUnit='second'"
	 * @generated
	 */
	Long getMaximumOperationTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GenericOperationCapabilitiesStructure#getMaximumOperationTimeout <em>Maximum Operation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Operation Timeout</em>' attribute.
	 * @see #getMaximumOperationTimeout()
	 * @generated
	 */
	void setMaximumOperationTimeout(Long value);

} // CIM_GenericOperationCapabilitiesStructure
