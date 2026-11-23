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
 * A representation of the model object '<em><b>CIM J2ee JDBC Resource Uses Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_J2eeJDBCResourceUsesDataSource is an association that identifies the JDBC data sources that are available to a CIM_J2eeJDBCResource.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJDBCResourceUsesDataSource()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.Dependent='CIM_J2eeJDBCResource REF' override.Dependent.Min='1' override.Dependent.Max='1' override.Dependent.Description='The JDBC Resource that requires a Data Source.' override.Antecedent='CIM_J2eeJDBCDataSource REF' override.Antecedent.Min='1' override.Antecedent.Description='The Data Source that is being used by a JDBC Resource.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJDBCResourceUsesDataSource extends CIM_HostedDependency {
} // CIM_J2eeJDBCResourceUsesDataSource
