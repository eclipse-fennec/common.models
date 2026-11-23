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
 * A representation of the model object '<em><b>CIM Database Control File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_DatabaseControlFile is a specialization of the CIM_Dependency association that identifies the LogicalFiles that provide control information for a Database. As an example, some implementations of CommonDatabase assign particular significance to a small number of files that contain database state and configuration information. This association is intended to provide an efficient means of identifying these files.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseControlFile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10' UMLPackagePath='CIM::Database::Storage' override.Antecedent='CIM_CommonDatabase REF' override.Antecedent.Min='0' override.Antecedent.Max='1' override.Antecedent.Description='The parent CommonDatabase for the associated control file.' override.Dependent='CIM_LogicalFile REF' override.Dependent.Description='The LogicalFile that contains control information for the associated CommonDatabase.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseControlFile extends CIM_HostedDependency {
} // CIM_DatabaseControlFile
