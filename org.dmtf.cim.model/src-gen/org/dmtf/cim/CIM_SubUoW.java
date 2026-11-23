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
 * A representation of the model object '<em><b>CIM Sub Uo W</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Similar to the SubUoWDef association (which describes the relationship between definitional UnitsOfWork), this association identifies the executional UnitOfWork Dependencies. It associates executing/executed UnitsOfWork with their parent Units. In most cases, the SubUoW reflects the execution side of the relationship defined in SubUoWDef. However, there may be cases where the SubUoWDef is not defined, but for a particular UnitOfWork, the SubUoW relationship is valid. Therefore, it is not a requirement (but it is desirable) that there be a corresponding SubUoWDef for each instance of SubUoW.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SubUoW()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Metrics::UnitOfWork' override.Antecedent='CIM_UnitOfWork REF' override.Antecedent.Max='1' override.Antecedent.Description='The parent executing/executed UnitOfWork. On the execution side, it is expected that a sub-Unit is associated with only one parent UnitOfWork.' override.Dependent='CIM_UnitOfWork REF' override.Dependent.Description='The sub-UnitOfWork. On the execution side, it is expected that a sub-Unit is associated with only one parent UnitOfWork.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SubUoW extends CIM_Dependency {
} // CIM_SubUoW
