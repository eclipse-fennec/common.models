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
 * A representation of the model object '<em><b>CIM Summary Diagnostics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A summary of test results for the last execution of the test identified by the ServiceName. Note that an element would typically have multiple
 * instances of CIM_SummaryDiagnostics, one for each test that was run on the element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SummaryDiagnostics#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SummaryDiagnostics#getTestTimeStamp <em>Test Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SummaryDiagnostics#getErrorAlerts <em>Error Alerts</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SummaryDiagnostics#getWarningAlerts <em>Warning Alerts</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SummaryDiagnostics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.51.0' UMLPackagePath='CIM::System' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='InstanceID is an optional property that may be used to opaquely and uniquely identify an instance of this class within the scope of the instantiating Namespace. Various subclasses of this class may override this property to make it required, or a key. Such subclasses may also modify the preferred algorithms for ensuring uniqueness that are defined below.\nTo ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If not null and the above \"preferred\" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nIf not set to null for DMTF-defined instances, the \"preferred\" algorithm must be used with the &lt;OrgID&gt; set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SummaryDiagnostics extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the name of the subtest that was run.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SummaryDiagnostics_ServiceName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SummaryDiagnostics#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Test Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A timestamp indicating when the test was run.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Time Stamp</em>' attribute.
	 * @see #setTestTimeStamp(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SummaryDiagnostics_TestTimeStamp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTestTimeStamp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SummaryDiagnostics#getTestTimeStamp <em>Test Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Time Stamp</em>' attribute.
	 * @see #getTestTimeStamp()
	 * @generated
	 */
	void setTestTimeStamp(String value);

	/**
	 * Returns the value of the '<em><b>Error Alerts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings that are embedded instances of CIM_AlertIndication for
	 * errors generated by the test.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Alerts</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SummaryDiagnostics_ErrorAlerts()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getErrorAlerts();

	/**
	 * Returns the value of the '<em><b>Warning Alerts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of strings that are embedded instances of CIM_AlertIndication for
	 * warnings generated by the test.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warning Alerts</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SummaryDiagnostics_WarningAlerts()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getWarningAlerts();

} // CIM_SummaryDiagnostics
